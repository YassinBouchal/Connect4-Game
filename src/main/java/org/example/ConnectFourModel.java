package org.example;

public class ConnectFourModel {
    private static char[][] board; // creates a board with 6 rows, 7 columns
    private static char currentPlayer;

    public ConnectFourModel() {
        board = new char[6][7];
        currentPlayer = 'X';
        initializeBoard();
    }

    private void initializeBoard() {
        for (int row = 0; row < 6; row++) {
            for (int col = 0; col < 7; col++) {
                board[row][col] = ' ';
            }
        }
    }

    public char[][] getBoard() {
        return board;
    }

    public char getCurrentPlayer() {
        return currentPlayer;
    }

    public void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    public static boolean isColumnValid(int col) {
        return board[0][col] == ' ';
    }

    public static boolean dropPiece(int col) {  // rows start from TOP to BOTTOM
        for (int row = 5; row >= 0; row--) {
            if (board[row][col] == ' ') {
                board[row][col] = currentPlayer;
                return true;
            }
        }
        return false;
    }

}
