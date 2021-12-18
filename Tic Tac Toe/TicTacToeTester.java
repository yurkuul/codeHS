import java.util.Scanner;

public class TicTacToeTester
{
    public static void main(String[] args)
    {
        TicTacToe t = new TicTacToe();
        Scanner s = new Scanner(System.in);
        System.out.println ("Current board:");
        t.printBoard();
        System.out.println ();
        
        System.out.println ("Player 1, eneter the row you would like to go");
        int row = s.nextInt();
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
        if (t.pickLocation(row, column)) {
            t.takeTurn (row, column);
        } else {
            System.out.println ("That spot is already taken!");
        }
        System.out.println ();
        System.out.println ("Current board:");
        t.printBoard();
        System.out.println ();
    }
}
