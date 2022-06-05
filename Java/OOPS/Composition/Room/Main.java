package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Wall wall1 = new Wall("East");
        Wall wall2 = new Wall("West");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(9,54);

        Bed bed = new Bed("Modern",4,3,2,1);

        Lamp lamp = new Lamp("Classic",false,76);

        Bedroom bedroom = new Bedroom("Sid's Bedroom", wall1,wall2,wall3,wall4, ceiling, bed,lamp);
        bedroom.makeBed();
        bedroom.getLamp().turnOn();

    }
}
