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


}
