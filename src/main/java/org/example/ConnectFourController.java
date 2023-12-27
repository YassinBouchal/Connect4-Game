package org.example;

import static org.example.ConnectFourModel.dropPiece;

public class ConnectFourController {

    private ConnectFourModel model;
    private Player human;
    private Player computer;


    public ConnectFourController() {
        model = new ConnectFourModel();
        human = new Human('X');
        computer = new Computer('O');
    }

    // Check horizontally
    private boolean checkHorizontally() {
        for (int row = 0; row < 6; row++) {
            for (int col = 0; col < 4; col++) {
                if (model.getBoard()[row][col] != ' ' &&
                        model.getBoard()[row][col] == model.getBoard()[row][col + 1] &&
                        model.getBoard()[row][col] == model.getBoard()[row][col + 2] &&
                        model.getBoard()[row][col] == model.getBoard()[row][col + 3]) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean checkVertically() {
        // Check vertically for a win
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 7; col++) {
                if (model.getBoard()[row][col] != ' ' &&
                        model.getBoard()[row][col] == model.getBoard()[row + 1][col] &&
                        model.getBoard()[row][col] == model.getBoard()[row + 2][col] &&
                        model.getBoard()[row][col] == model.getBoard()[row + 3][col]) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean checkDiagonally() {
        // Check diagonally (from top-left to bottom-right)
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                if (model.getBoard()[row][col] != ' ' &&
                        model.getBoard()[row][col] == model.getBoard()[row + 1][col + 1] &&
                        model.getBoard()[row][col] == model.getBoard()[row + 2][col + 2] &&
                        model.getBoard()[row][col] == model.getBoard()[row + 3][col + 3]) {
                    return true;
                }
            }
        }

        // Check diagonally (from top-right to bottom-left)
        for (int row = 0; row < 3; row++) {
            for (int col = 3; col < 7; col++) {
                if (model.getBoard()[row][col] != ' ' &&
                        model.getBoard()[row][col] == model.getBoard()[row + 1][col - 1] &&
                        model.getBoard()[row][col] == model.getBoard()[row + 2][col - 2] &&
                        model.getBoard()[row][col] == model.getBoard()[row + 3][col - 3]) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean checkForWin() {
        return checkHorizontally() || checkVertically() ||checkDiagonally();

    }

    private boolean isBoardFull() {
        for (int col = 0; col < 7; col++) {
            if (model.getBoard()[0][col] == ' ') {
                return false; // Board is not full
            }
        }
        return true; // Board is full
    }

    public void playGame() {
        printBoard();
        while (true) {

            int column = (model.getCurrentPlayer() == 'X') ? human.play() : computer.play();


            if (!dropPiece(column)) {
                System.out.println("Column is full. Try again.");
                continue;
            }

            if (model.getCurrentPlayer() == 'O')
                printBoard();

            if (checkForWin()) {
                printBoard();
                System.out.println("Player " + model.getCurrentPlayer() + " wins!");
                break;
            }

            if (isBoardFull()) {
                printBoard();
                System.out.println("The game is a draw!");
                break;
            }

            model.switchPlayer();
        }
    }

    private void printBoard() {
        System.out.println("  1   2   3   4   5   6   7");
        for (int row = 0; row < 6; row++) {
            for (int col = 0; col < 7; col++) {
                System.out.print(" " + model.getBoard()[row][col] + " ");
                if (col < 6) System.out.print("|");
            }
            System.out.println();
            if (row < 5) System.out.println("-------------------------------");
        }
        System.out.println("  1   2   3   4   5   6   7");
    }

}
