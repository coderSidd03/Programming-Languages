

package com.company;

public class Main {

    public static void main(String[] args) {

        Person sidd = new Person();
        sidd.setFirstName(" ");
        sidd.setLastName(" ");
        sidd.setAge(13);

        System.out.println("Full name  = "+ sidd.getFullName());
        System.out.println("Teen  = "+ sidd.isTeen());

        sidd.setFirstName("Soumyadeep");
        sidd.setAge(25);
        System.out.println("Full name = " + sidd.getFullName());
        System.out.println("Teen = " + sidd.isTeen());
        sidd.setLastName("Chakraborty");
        System.out.println("Full name = " + sidd.getFullName());

    }
}

