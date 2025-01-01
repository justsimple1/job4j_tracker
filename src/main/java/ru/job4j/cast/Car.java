package ru.job4j.cast;

public class Car implements Vehicle {
    @Override
    public void move() {
        System.out.println("Rides on road");
    }

    @Override
    public void currentTransport() {
        System.out.println("It`s a car");
    }
}
