package com.company;

public class Main {

    public static void main(String[] args) {
	SimpleCalculator calculator = new SimpleCalculator();

    calculator.setFirstNumber(8.0);
    calculator.setSecondNumber(0);

        System.out.println("add = " + calculator.getAdditionResult());
        System.out.println("Subtract = " + calculator.getSubtractionResult());
        System.out.println("Multiply = " + calculator.getMultiplicationResult());
        System.out.println("division = " + calculator.getDivisionResult());
    }
}
