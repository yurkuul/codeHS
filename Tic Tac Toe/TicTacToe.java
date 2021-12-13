public class TicTacToe
{
   private int turn;
   private char[][] board = {{' ', '0', '1', '2'},
                            {'0', '-', '-', '-'},
                            {'1', '-', '-', '-'},
                            {'2', '-', '-', '-'}};
   
   public TicTacToe () {
       turn = 0;
   }
   
   public int getTurn() {
       return turn;
   }

   public void printBoard() {
       for (int r = 0; r < board.length; r++) {
           for (int c = 0; c < board[r].length; c++) {
              System.out.print (board[r][c] + " ");
           }
           System.out.println();
       }
   }
   
   public boolean pickLocation(int row, int col) {
       return board[row+1][col+1] == '-';
   }
   
   public void takeTurn(int row, int col) {
       if (turn % 2 == 0) {
           board[row+1][col+1] = 'X';
       } else {
           board[row+1][col+1] = 'O';
       }
       turn++;
   }
   
   public boolean checkRow()
   {
       String row = "";
       String player1Win = "XXX";
       String player2Win = "OOO";
       for (int r = 0; r < board.length-1; r++) {
           for (int c = 0; c < board[r].length-1; c++) {
               row += board[r+1][c+1];
           }
           if (row.equals (player1Win) || row.equals (player2Win)) {
               return true;
            }
            row = "";
       }
       return false;
   }
}
