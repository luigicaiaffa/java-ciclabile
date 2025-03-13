package org.lessons.java;

public class Main {

    public static void main(String[] args) {

        int[] arrayNumbers = { 10, 25, 47, 78, 120 };
        Numbers integers = new Numbers(arrayNumbers);

        System.out.println("-------");

        integers.getNumbers();

        while (integers.hasNextElements()) {
            System.out.println(integers.getNextElement());
        }

        // # Bonus
        integers.addElement(36);
        integers.addElement(64);
        integers.addElement(82);

        while (integers.hasNextElements()) {
            System.out.println(integers.getNextElement());
        }

        System.out.println("-------");

    }
}
