package org.example;

import java.util.Scanner;
//import static org.example.ConnectFourModel.isColumnValid;

public class Human extends Player{
    private ConnectFourModel model;
    private Scanner scanner;
    Human(char symbol) {
        super(symbol);
        this.scanner = new Scanner(System.in);
    }


    @Override
    public int play() {
        model = new ConnectFourModel();
        int column;
        do {
            System.out.print("Player " + symbol + ", enter a column (1-7): ");
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Enter a valid column (1-7): ");
                scanner.next(); // consume the invalid input
            }
            column = scanner.nextInt();


        } while (!model.isColumnValid(column - 1));

        return column-1;
    }
}
