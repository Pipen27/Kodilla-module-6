package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "PRODUCTS")
public class Product {

    private int id;
    private String name;
    private Item item;

    public Product() {
    }

    public Product(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }


    @NotNull
    @Column(name = "PRODUCT_NAME")
    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    @ManyToOne
    @JoinColumn(name = "ITEM_ID")
    public Item getItem() {
        return item;
    }

    private void setItem(Item item) {
        this.item = item;
    }
}
