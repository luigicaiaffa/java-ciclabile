package org.lessons.java;

public class Main {

    public static void main(String[] args) {

        int[] arrayNumbers = { 10, 25, 47, 78, 120 };

        Numbers integers = new Numbers(arrayNumbers);
        System.out.println("-------");
        integers.getNumbers();

        System.out.println("\n");

        System.out.println(integers.getNextElement());

        System.out.println(integers.getNextElement());
        System.out.println(integers.hasNextElements());

        System.out.println(integers.getNextElement());

        System.out.println(integers.getNextElement());

        System.out.println(integers.getNextElement());
        System.out.println(integers.hasNextElements());

        System.out.println("-------");

    }
}
