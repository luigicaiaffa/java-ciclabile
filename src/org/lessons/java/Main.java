package org.lessons.java;

public class Main {

    public static void main(String[] args) {

        int[] arrayNumbers = { 1, 2, 3, 4, 5 };

        Numbers integers = new Numbers(arrayNumbers);
        System.out.println("-------");
        integers.getNumbers();

        System.out.println("\n");
        System.out.println(integers.getNextElement());
        System.out.println(integers.getNextElement());
        System.out.println(integers.getNextElement());
        System.out.println(integers.getNextElement());
        System.out.println(integers.getNextElement());

        System.out.println("-------");

    }
}
