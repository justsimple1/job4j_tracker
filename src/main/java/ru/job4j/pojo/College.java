package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Andrey Petrovich Petrov");
        student.setGroup("Chemistry");
        student.setDate(new Date());

        System.out.println(student.getFullName() + " will study in group: " + student.getGroup() + ", start to study: " + student.getDate());
    }
}
