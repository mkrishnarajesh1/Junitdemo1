package com.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {

    private ShoppingCart Cart;

    private Item item1;
    private Item item2;
    @BeforeEach
    void setUp(){
        item1 = new Item("Iphone", 5000);
        item2 = new Item("Mac", 6000);
        Cart = new ShoppingCart();

    }
    @Test
    @DisplayName( "Adding Items to the Cart")
    void shouldaddItemtoCart(){

        Cart.addItem(item1);

        assertTrue(Cart.containsItem(item1));

    }

    @Test
    void shouldRemoveItemfromCart(){


        Cart.removeItem(item2);
        Cart.removeItem(item1);
        assertFalse(Cart.containsItem(item1));
        assertFalse(Cart.containsItem(item2));
    }

}