package ru.job4j.oop;

public class Cat {

    private String food;

    private String name;

    public void show() {
        System.out.println(this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.giveNick("gav");
        System.out.println("There is " + gav.name + "'s food.");
        gav.eat("Котлета");
        gav.show();
        Cat black = new Cat();
        black.giveNick("black");
        System.out.println("There is " + black.name + "'s food.");
        black.eat("fish");
        black.show();
    }
}