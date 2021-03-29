package com.franksBurger;

public class Main {

    public static void main(String[] args) {

            Hamburger hamburger = new Hamburger("cheese","fowl",22,"bread");
            hamburger.addHamburgerAddition1("sauce",21);
            System.out.println(hamburger.itemizehamburger());
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println();

            DeluxeBurger deluxeBurger = new DeluxeBurger();
            System.out.println(deluxeBurger.itemizehamburger());

            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println();

            HealthyBurger healthyBurger = new HealthyBurger("fowl",(5.67));
            healthyBurger.addHamburgerAddition1("saucage",5.43);

            System.out.println(healthyBurger.itemizehamburger());    }
}
