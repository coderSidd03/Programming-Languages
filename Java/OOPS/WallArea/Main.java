

package com.company;

public class Main {

    public static void main(String[] args) {

        Wall wall_1 = new Wall(5,4);
        System.out.println("area = "+ wall_1.getArea());

        wall_1.setHeight(-1.5);
        System.out.println("width = " + wall_1.getWidth());
        System.out.println("height = " + wall_1.getHeight());
        System.out.println("area = " + wall_1.getArea());

    }
}
