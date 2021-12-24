import java.util.Scanner;

public class TicTacToeTester
{
    public static void main(String[] args)
    {
        //Setup for TicTacToe game
        TicTacToe t = new TicTacToe();
        Scanner s = new Scanner(System.in);
        System.out.println ("Current board:");
        t.printBoard();
        System.out.println ();
        
        //Prompt player 1 for what row and column they would like to go
        System.out.println ("Player 1, eneter the row you would like to go");
        int row = s.nextInt();
        //Checks to see if the space inputted is valid or not based on the grid system
        while (row > 2 || row < 0) {
            System.out.println ("That space is invalid!");
            System.out.println ("Player 1, eneter the row you would like to go");
            row = s.nextInt();
        }
        System.out.println ("Now enter the column you would like to go");
        int column = s.nextInt();
        while (column > 2 || column < 0) {
            System.out.println ("That space is invalid!");
            System.out.println ("Player 1, eneter the column you would like to go");
            column = s.nextInt();
        }
        //Checks to see if the space inputted has been taken/filled already, otherwise, fill the location based on whose turn it is
        if (t.pickLocation(row, column)) {
            t.takeTurn (row, column);
        } else {
            System.out.println ("That spot is already taken!");
        }
        System.out.println ();
        System.out.println ("Current board:");
        t.printBoard();
        System.out.println ();
        //Continue asking the players for a location until a player wins
        //If no one wins and the entire board is filled, then this while loop ends
        while (!t.checkWin() && t.getTurn() < 9) {
            int theTurn = t.getTurn() % 2 + 1;
            System.out.println ("Player " + theTurn + ", eneter the row you would like to go");
            row = s.nextInt();
            while (row > 2 || row < 0) {
                System.out.println ("That space is invalid!");
                System.out.println ("Player " + theTurn + ", eneter the row you would like to go");
                row = s.nextInt();
            }
            System.out.println ("Now enter the column you would like to go");
            column = s.nextInt();
            while (column > 2 || column < 0) {
                System.out.println ("That space is invalid!");
                System.out.println ("Player " + theTurn + ", eneter the row you would like to go");
                column = s.nextInt();
            }
            if (t.pickLocation(row, column)) {
                t.takeTurn (row, column);
            } else {
                System.out.println ("That spot is already taken!");
            }
            System.out.println ();
            System.out.println ("Current board:");
            t.printBoard();
            System.out.println ();
            if (t.checkWin()) {
                System.out.println ("Player " + theTurn + " has won!");
            }
        }
        //If the above while loop ends, then no one has won but the board is filled, so it is a tie
        if (!t.checkWin()) {
            System.out.println ("It is a tie!");
        }
    }
}
