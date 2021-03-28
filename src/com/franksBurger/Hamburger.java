package com.franksBurger;

    public class Hamburger {
        private String name;
        private String meat;
        private double price, totalPrice;
        private String breadRollType;
        private String addition1Name, addition2Name,addition3Name,addition4Name;
        private double addition1Price, addition2Price, addition3Price, addition4Price;


        public Hamburger(){
            double nameint;
            double meatint;
            double breadRollTypeint;
            nameint = (Math.random()*4);
            switch((int) nameint){
                case 1:
                    this.name = "DeluxeBurger";
                    price += 5.0;
                    break;
                case 2:
                    this.name = "Hamburger";
                    price += 5.0;
                    break;

                default:
                    this.name = "Tacos";
                    price += 5.0;
                    break;
            }
            meatint = (Math.random()*4);
            switch((int) meatint){
                case 1:
                    this.meat = "Beaf";
                    price += 4.0;
                    break;
                case 2:
                    this.meat = "chicken";
                    price += 4.0;
                    break;
                default:
                    this.meat = "steak";
                    price += 4.0;
                    break;
            }
            breadRollTypeint = (Math.random()*4);
            switch((int) breadRollTypeint){
                case 1:
                    this.breadRollType = "bread";
                    price += 5.54;
                    break;
                case 2:
                    this.breadRollType = "labanese";
                    price += 5.54;
                    break;
                default:
                    this.breadRollType = "burger";
                    price += 5.54;
                    break;
            }
        }

        public Hamburger(String meat, double price){
            this("healthy burger",meat,price,"breadRollType");

        }
        public Hamburger(String name, String meat, double price, String breadRollType){
            this.name = name;
            this.meat = meat;
            this.price = price;
            this.breadRollType = breadRollType;
        }

        public void addHamburgerAddition1(String name, double price){
            this.addition1Name = name;
            this.addition1Price = price;
        }

        public void addHamburgerAddition2(String name, double price){
            this.addition2Name = name;
            this.addition2Price = price;
        }
        public void addHamburgerAddition3(String name,double price ){
            this.addition3Name = name;
            this.addition3Price = price;
        }
        public void addHamburgerAddition4(String name, double price){
            this.addition4Name = name;
            this.addition4Price = price;
        }
        public double itemizehamburger(){
            double totalPrice = this.price;
            System.out.println("A " + this.name + " with " + this.meat + " and " + this.breadRollType + " cost :" + this.price);
            if(addition1Name!=null){
                System.out.println("with an addition of " + addition1Name + " cost :"+ addition1Price);
                totalPrice += addition1Price;
            }
            else if(addition2Name!=null){
                System.out.println("with an addition of " + addition2Name + " cost :"+ addition2Price);
                totalPrice += addition1Price;
            }
            if(addition3Name!=null){
                System.out.println("with an addition of " + addition3Name + " cost :"+ addition3Price);
                totalPrice += addition1Price;
            }
            if(addition4Name!=null){
                System.out.println("with an addition of " + addition4Name + " cost :"+ addition4Price);
                totalPrice += addition1Price;
            }
            return totalPrice;
        }

//    Customer details for branch Adelaide
//    Customer: Tim[1]
//    Transactions
//[1]  Amount 50.05
//            [2]  Amount 44.22
//            [3]  Amount 12.44
//    Customer: Mike[2]
//    Transactions
//[1]  Amount 175.34
//            [2]  Amount 1.65
//    Customer: Percy[3]
//    Transactions
//[1]  Amount 220.12


//        int number = 0;
//        int count = 0;
//        int sum = 0;
////        boolean leap = Exercices.isLeapYear(1924);
////        System.out.println(leap);
//        for (int i = 1; i <= 1000; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                sum = number + i;
//                count++;
//                System.out.println(i);
//                if (count == 5)
//                    break;
//            }
//        }
//        System.out.println(sum);
//        DiagonalStar.printSquareStar(16);
//InputCalculator.inputThenPrintSumAndAverage();

//        Car car = new Car(5,"porche");
//        Mitsubishi mitsubishi = new Mitsubishi(5,"alfa");
//        System.out.println(mitsubishi.accelerate());
//
//        Hamburger hamburger = new Hamburger("cheese","fowl",22,"bread");
//        hamburger.addHamburgerAddition1("sauce",21);
//        System.out.println(hamburger.itemizehamburger());
//        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
//        System.out.println();
//
//        DeluxeBurger deluxeBurger = new DeluxeBurger();
//        System.out.println(deluxeBurger.itemizehamburger());
//
//        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
//        System.out.println();
//
//        HealthyBurger healthyBurger = new HealthyBurger("fowl",(5.67));
//        healthyBurger.addHamburgerAddition1("saucage",5.43);
//
//        System.out.println(healthyBurger.itemizehamburger());
}
