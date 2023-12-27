package org.example;

import java.util.Random;


public class Computer extends Player{
    private Random random;
    Computer(char symbol) {
        super(symbol);
        this.random = new Random();
    }

    @Override
    public int play() {
        int column = getRandomNumber(1, 8);

        return column-1;
    }

    public static int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min; // Randomly choose a colum (1-7)
    }


}
