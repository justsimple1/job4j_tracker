package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return x - y;
    }

    public int divide(int y) {
        return x / y;
    }

    public void sumAllOperation(int y) {
        int result = divide(y) + sum(y) + minus(y) + multiply(y);
        System.out.println("Sum all operation is " + result);
    }

    public int multiply(int a) {
        return x * a;
    }

    public static void main(String[] args) {
        int sum = sum(3);
        System.out.println("sum is " + sum);
        int minus = minus(3);
        System.out.println("minus is " + minus);
        Calculator calculator = new Calculator();
        int divide = calculator.divide(3);
        System.out.println("divide is " + divide);
        int multiple = calculator.multiply(3);
        System.out.println("multiple is " + multiple);
        calculator.sumAllOperation(3);
    }
}