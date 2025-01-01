package ru.job4j.cast;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Rides on rails");
    }

    @Override
    public void currentTransport() {
        System.out.println("It`s a train");
    }
}
