

package com.company;

public class Main {

    public static void main(String[] args) {

        VipCustomer person_1 = new VipCustomer();
        System.out.println(person_1.getName());
        System.out.println(person_1.getCreditLimit());
        System.out.println(person_1.getEmailId());


        VipCustomer person_2 = new VipCustomer("Mandira Chakraborty", 100000);
        System.out.println(person_2.getName());
        System.out.println(person_2.getCreditLimit());
        System.out.println(person_2.getEmailId());

        VipCustomer person_3 = new VipCustomer("Soumyadeep Chakraborty" , 50000 , "isoumya03@gmail.com");
        System.out.println(person_3.getName());
        System.out.println(person_3.getCreditLimit());
        System.out.println(person_3.getEmailId());
    }
}
