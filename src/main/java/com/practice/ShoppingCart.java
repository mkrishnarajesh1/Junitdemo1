package com.practice;
//Changes are being made to this file
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> items;

    public ShoppingCart(){

        items = new ArrayList<>();

    }
    public void addItem(Item item){

        items.add(item);

    }

    public void removeItem(Item item){

        items.remove(item);

    }

    public boolean containsItem(Item item){
        return items.contains(item);
    }

    public double calculateTotalPrice(){
        double totalPrice = 0.0;
        for(Item e: items){
            totalPrice += e.getPrice();
        }
        return totalPrice;
    }


}
