package com.franksBurger;

import java.text.DecimalFormat;

public class DeluxeBurger extends Hamburger{

    DecimalFormat type = new DecimalFormat("#.##");

    public DeluxeBurger(){
        super();

    }
    @Override
    public void addHamburgerAddition1(String name, double price){
        System.out.println("Cannot add additional items to deluxe burger");
    }
    @Override
    public void addHamburgerAddition2(String name, double price){
        System.out.println("Cannot add additional items to deluxe burger");
    }
    @Override
    public void addHamburgerAddition3(String name,double price ){
        System.out.println("Cannot add additional items to deluxe burger");
    }
    @Override
    public void addHamburgerAddition4(String name, double price){
        System.out.println("Cannot add additional items to deluxe burger");
    }
    @Override
    public double itemizehamburger(){
        double totalPrice = super.itemizehamburger();
        System.out.println("Added chips for an extra 2.75");
        System.out.println("Added drink for an extra 1.81");
        totalPrice += 4.560;
        return  totalPrice;
    }
}

