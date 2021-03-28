package com.franksBurger;

public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price){
        super(meat,price);
    }
    public void addHealthyAddition1(String name, int price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }
    public void addHealthyAddition2(String name, int price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizehamburger(){
        double totalPrice = super.itemizehamburger();
        if(healthyExtra1Name!=null){
            System.out.println("with an addition of " + healthyExtra1Name + " cost :"+ healthyExtra1Price);
            totalPrice += healthyExtra1Price;
        }
        else if(healthyExtra2Name!=null){
            System.out.println("with an addition of " + healthyExtra2Name + " cost :"+ healthyExtra2Price);
            totalPrice += healthyExtra2Price;
        }
        return totalPrice;
    }
}

