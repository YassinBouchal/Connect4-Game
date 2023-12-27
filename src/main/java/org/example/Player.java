package org.example;

abstract class Player {
    protected char symbol;

    Player(char symbol){
        this.symbol = symbol;
    }

    abstract int play();


}
