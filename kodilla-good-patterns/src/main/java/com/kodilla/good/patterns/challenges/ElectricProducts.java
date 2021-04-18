package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.List;

class ElectricProducts implements ListsOfProducts {

    public List <ProductDescriber> electricProductsList = new ArrayList<>();


    public void addProduct(ProductDescriber productDescriber) {
      electricProductsList.add(productDescriber);

    }


}
