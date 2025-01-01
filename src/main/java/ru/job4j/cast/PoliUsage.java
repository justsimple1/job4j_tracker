package ru.job4j.cast;

public class PoliUsage {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle train = new Train();
        Vehicle airplane = new Airplane();

        Vehicle[] vehicles = new Vehicle[]{car, train, airplane};
        for (Vehicle object: vehicles
             ) {
            object.currentTransport();
            object.move();
        }
    }
}
