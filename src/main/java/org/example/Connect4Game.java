package org.example;

/**
 * This code defines a simple console-based Connect 4 game in Java.
 * Players (Human and Computer) take turns entering the column where they want to drop their piece (numbered 1-7).
 * The game continues until a player wins or the board is full.
 * The winning condition is checked horizontally, vertically, and diagonally.
 */

public class Connect4Game {
    public static void main(String[] args) {

        ConnectFourController controller = new ConnectFourController();
        controller.playGame();

    }
}


