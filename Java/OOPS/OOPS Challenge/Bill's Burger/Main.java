package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Hamburger obj = new Hamburger("Base_Burger", "mutton", 120.00, "White");
//        double price = obj.itemizeHamburger();
//        obj.addHamburgerAddition1("carrot",20);
//        obj.addHamburgerAddition2("lettuce",50);
//        obj.addHamburgerAddition3("tomatto",10);
//        obj.addHamburgerAddition4("extra meat",80);
//        System.out.println("Total Burger price is : " + obj.itemizeHamburger());


//        HealthyBurger obj2 = new HealthyBurger("chicken",150.00);
////        obj2.itemizeHamburger();
//        obj2.addHealthyAddition1("tomato",10);
//        System.out.println("Total Burger Price " + obj2.itemizeHamburger());


//        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
//        hamburger.addHamburgerAddition1("Tomato", 0.27);
//        hamburger.addHamburgerAddition2("Lettuce", 0.75);
//        hamburger.addHamburgerAddition3("Cheese", 1.13);
//        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());
//
//        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
//        healthyBurger.addHamburgerAddition1("Egg", 5.43);
//        healthyBurger.addHealthyAddition1("Lentils", 3.41);
//        System.out.println("Total Healthy Burger price is  " + healthyBurger.itemizeHamburger());

//        DeluxeBurger db = new DeluxeBurger();
//        db.addHamburgerAddition3("Should not do this", 50.53);
//        System.out.println("Total Deluxe Burger price is " + db.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition1("oregano", 30);
        System.out.println("Total Deluxe Burger Price is " + db.itemizeHamburger());

    }
}
