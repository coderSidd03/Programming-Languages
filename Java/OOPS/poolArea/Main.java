package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Rectangle obj = new Rectangle(5,10);
        System.out.println("Rectangle.width ():" + obj.getWidth());
        System.out.println("Rectangle.length ():" + obj.getLength());
        System.out.println("Rectangle.area ():" + obj.getArea());


        Cuboid obj2 = new Cuboid(5,10,5);
        System.out.println("Cuboid.Height ():" + obj2.getHeight());
        System.out.println("Cuboid.width ():" + obj2.getWidth());
        System.out.println("Cuboid.length ():" + obj2.getLength());
        System.out.println("Cuboid.area ():" + obj2.getArea());
        System.out.println("Cuboid.volume ():" + obj2.getVolume());


    }
}
