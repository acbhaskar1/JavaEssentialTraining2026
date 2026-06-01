// adding models to the programming style
package com.akshaya;

import com.akshaya.model.ClothingItem;

import java.text.NumberFormat;

public class App {
    public static void main(String[] args) throws Exception {
       var item = new ClothingItem();
       item.setType("Shirt");
       item.setSize("M");
       item.setPrice(99.99);
       item.setQty(4);

       var totalPrice = item.getPrice() * item.getQty();
       var formatter = NumberFormat.getCurrencyInstance();
       var output = String.format("The total selling price of %s with size %s for a %d quantity is %s", item.getType(), item.getSize(), item.getQty(), formatter.format(totalPrice));
        System.out.println(output);
    }
}
