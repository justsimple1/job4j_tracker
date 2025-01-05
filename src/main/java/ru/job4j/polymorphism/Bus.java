package ru.job4j.polymorphism;

public class Bus implements Transport {
    @Override
    public void move() {
        System.out.println("The bus started moving");
    }

    @Override
    public void passengers(int count) {
        System.out.println(count + "passengers boarded");
    }

    @Override
    public int refuel(int fuel) {
        return fuel;
    }
}