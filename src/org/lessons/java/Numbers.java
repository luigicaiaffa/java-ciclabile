package org.lessons.java;

import java.util.ArrayList;

public class Numbers {

    // # Variabili d'istanza
    private int[] integerNumbers;
    private int currentIndex;

    // # Costruttori
    public Numbers(int[] numbersArray) {
        this.integerNumbers = numbersArray;
        this.currentIndex = 0;
    }

    // # Metodi
    public void getNumbers() {
        ArrayList<Integer> integerArray = new ArrayList<>();

        for (int num : integerNumbers) {
            integerArray.add(num);
        }

        System.out.println("\n" + integerArray);
    }

    public int getNextElement() {
        int currentNumber = integerNumbers[currentIndex];
        currentIndex++;
        return currentNumber;
    }

}
