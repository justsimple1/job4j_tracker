package ru.job4j.cast;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println("Flies in the sky");
    }

    @Override
    public void currentTransport() {
        System.out.println("It`s a airplane");
    }
}
