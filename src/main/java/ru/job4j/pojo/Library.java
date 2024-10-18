package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book[] books = new Book[4];

        Book bookFirst = new Book("Clean Code", 210);
        Book bookSecond = new Book("Clean Code 2", 220);
        Book bookThird = new Book("Mowgli", 120);
        Book bookFourth = new Book("I`m not dummy", 3);
        books[0] = bookFirst;
        books[1] = bookSecond;
        books[2] = bookThird;
        books[3] = bookFourth;

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName());
        }
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName());
        }

        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals("Clean Code")) {
                System.out.println(books[i].getName());
            }
        }
    }
}
