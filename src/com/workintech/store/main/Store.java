package com.workintech.store.main;

import com.workintech.store.models.Bread;
import com.workintech.store.models.Chocolate;
import com.workintech.store.models.Coke;
import com.workintech.store.models.ProductForSale;

public class Store {
    public static void main(String[] args) {
        //ProductForSale sale = new ProductForSale();
        ProductForSale[] sales = new ProductForSale[5];
        //ProductForSale sale = new Chocolate();
        sales[0] = new Chocolate("Sweet", 20, "Yazılımcı dostu",
                "brown", true);
        sales[1] = new Bread("Bakery", 50, "Siyaz unundan ekmek",
                "einkorn", "brown");
        sales[2] = new Coke("Drinks", 10, "Soguk iciniz", true);
        //[Chocolate, Bread, Coke, null, null]
        listProducts(sales);
        listProducts(null);
    }

    public static void listProducts(ProductForSale[] products) {
        if (products != null) {
            for (ProductForSale product : products) {
                if (product != null) {
                    product.showDetails();
                }
            }
        } else{
            System.out.println("Products can't be null");
        }
    }
}