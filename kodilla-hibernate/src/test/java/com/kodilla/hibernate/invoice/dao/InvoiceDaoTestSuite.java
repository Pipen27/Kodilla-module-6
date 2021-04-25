package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product phone1 = new Product("Samsung S10");
        Product phone2 = new Product("Motorola G8");
        Product phone3 = new Product("OnePlus 7T PRO");

        Item item1 = new Item(phone1, new BigDecimal(700), 1, new BigDecimal(700));
        Item item2 = new Item(phone3, new BigDecimal(750), 2, new BigDecimal(1500));
        Item item3 = new Item(phone2, new BigDecimal(500), 4, new BigDecimal(2000));

        List<Item> itemList = new ArrayList<>();
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);

        Invoice invoice1 = new Invoice("FV1/04/2021", itemList);

        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);
        invoice1.getItems().add(item3);


        //When
        invoiceDao.save(invoice1);
        int invoiceOne = invoice1.getId();

        //Then
        assertNotEquals(0, invoiceOne);

        //CleanUp
//        try {
//            invoiceDao.deleteById(invoiceOne);
//        } catch (Exception e) {
//            //do nothing
//        }
    }
}
