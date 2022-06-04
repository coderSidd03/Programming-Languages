package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Circle obj = new Circle(3.75);
        System.out.println("Circle radius : "+ obj.getRadius());
        System.out.println("Circle Area :" + obj.getArea());

        Cylinder obj2 = new Cylinder(5.55,7.25);
        System.out.println("cylinder.radius = " + obj2.getRadius());
        System.out.println("cylinder.height = " + obj2.getHeight());
        System.out.println("cylinder.area = " + obj2.getArea());
        System.out.println("cylinder.volume : " + obj2.getVolume());
    }
}
