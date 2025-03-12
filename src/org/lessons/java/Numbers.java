package org.lessons.java;

import java.util.ArrayList;
import java.util.Iterator;

public class Numbers {

    // # Variabili d'istanza
    private int[] integerNumbers;
    private int currentIndex;

    // # Costruttori
    public Numbers(int[] numbersArray) {
        this.integerNumbers = numbersArray;
        this.currentIndex = 0;
    }

    public Numbers() {
        this.integerNumbers = new int[0];
        this.currentIndex = 0;
    }

    // # Metodi
    public void getNumbers() {
        ArrayList<Integer> integerArray = new ArrayList<>();

        for (int num : integerNumbers) {
            integerArray.add(num);
        }

        System.out.println("\n" + integerArray + "\n");
    }

    public int getNextElement() {
        int currentNumber = integerNumbers[currentIndex];
        currentIndex++;

        return currentNumber;
    }

    public boolean hasNextElements() {
        ArrayList<Integer> integerArray = new ArrayList<>();

        for (int i = currentIndex; i < integerNumbers.length; i++) {
            integerArray.add(integerNumbers[i]);
        }

        Iterator<Integer> iterator = integerArray.iterator();

        return iterator.hasNext();
    }

    public void addElement(int newNumber) {
        // Creo un nuovo array più grande di 1 rispetto al mio array di interi
        int[] newArray = new int[integerNumbers.length + 1];

        // Copio il mio array di interi all'interno del nuovo array
        System.arraycopy(integerNumbers, 0, newArray, 0, integerNumbers.length);

        // All'ultima posizione aggiungo il nuovo numero da inserire nell'array
        newArray[newArray.length - 1] = newNumber;

        // Setto il nuovo array come array principale
        this.integerNumbers = newArray;
    }
}
