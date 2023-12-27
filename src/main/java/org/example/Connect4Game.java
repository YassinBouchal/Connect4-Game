package org.example;

//import static org.example.ConnectFourController.currentPlayer;
//import static org.example.ConnectFourController.isGameOver;

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

        // this is a test commit

//        Computer computer = new Computer("Bot");
//        Human human = new Human("Yassin");
//        initializeBoard();
//        printBoard();
//        do {
////            printBoard();
//            if (currentPlayer == 'X') {
//                human.play();
//            }
//            else {
//                computer.play();
//                printBoard();
//            }
////            printBoard();
//
//        } while (!isGameOver());
//        switchPlayer(); // pas optimal ce rajout ??? à checker
//        printBoard();
//
//        if (currentPlayer == 'X') {
//            System.out.println("You won the game!");
//        }
//        else
//            System.out.println("Sorry, the Computer has won the game!");
    }


//    static void switchPlayer() {
//        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
//    }

}


