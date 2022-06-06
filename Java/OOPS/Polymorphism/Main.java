package com.company;

// base class Car
class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String startEngine() {
        return ">> engine is starting...";
    }

    public String accelerate() {
        return ">> car is accelerating...";
    }

    public String brake() {
        return ">> car is braking...";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}

//Subclasses Mitsubishi, Holden, Ford

class Mitsubishi extends Car{

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return ">> Mitsubshi's engine is starting() ...";
    }

    @Override
    public String accelerate() {
        return ">> Mitsubishi accelerating() ...";
    }

    @Override
    public String brake() {
        return ">> Mitsubishi braking() ...";
    }
}

class Holden extends Car{

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return ">> Holden's engine is starting() ...";
    }

    @Override
    public String accelerate() {
        return ">> Holden accelerating() ...";
    }

    @Override
    public String brake() {
        return ">> Holden braking() ...";
    }
}

class Ford extends Car{

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return ">> Ford's engine is starting() ...";
    }

    @Override
    public String accelerate() {
        return ">> Ford accelerating() ...";
    }

    @Override
    public String brake() {
        return ">> Ford braking() ...";
    }
}





public class Main {

    public static void main(String[] args) {
	// write your code here
        Car car = new Car(2,"Base_Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());


        Mitsubishi mitsubishi = new Mitsubishi(4,"Mit_01()");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Holden holden = new Holden(3,"Holden_01()");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());

        Ford ford = new Ford(6,"Ford_01()");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());


    }
}
