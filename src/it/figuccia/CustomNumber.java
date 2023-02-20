package it.figuccia;

import java.util.Random;

public class CustomNumber {
    private int number;

    public CustomNumber() {
        Random rand = new Random();
        this.number = rand.nextInt(12) + 1;
        System.out.println("Generated random number: " + this.number);
    }

    public void getMultiplicationTable() {
        for (int i = 12; i >= 1; i--) {
            System.out.printf("%d x %d = %d\n", this.number, i, this.number * i);
        }
    }
}