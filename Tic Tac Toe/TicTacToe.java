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
   
   public boolean checkCol()
   {
       String column = "";
       String player1Win = "XXX";
       String player2Win = "OOO";
       for (int c = 0; c < board[0].length-1; c++) {
           for (int r = 0; r < board.length-1; r++) {
               column += board[r+1][c+1];
           }
           if (column.equals (player1Win) || column.equals (player2Win)) {
               return true;
            }
            column = "";
       }
       return false;
   }
   
   public boolean checkDiag()
   {
       String diagonal = "";
       String player1Win = "XXX";
       String player2Win = "OOO";
       /* 0 1 2             0 1 2
        0 X          or   0     X
        1   X             1   X
        2     X           2 X
        
        index[0][0], index[1][1], index[2][2] 
        or
        index[0][2], index[1][1], index[2][0]
        
       */
       //for first case scenario
       for (int r = 0; r < board.length-1; r++) {
           for (int c = 0; c < board[r].length-1; c++) {
               //System.out.println(board[c+1][c+1]);
               diagonal += board[c+1][c+1];
           }
           //System.out.println(diagonal);
           if (diagonal.equals (player1Win) || diagonal.equals (player2Win)) {
               return true;
            }
            diagonal = "";
       }
       //for second case scenario
       diagonal = "";
       diagonal += board[0+1][2+1];
       diagonal += board[1+1][1+1];
       diagonal += board[2+1][0+1];
       if (diagonal.equals (player1Win) || diagonal.equals (player2Win)) {
               return true;
        }
       return false;
   }
   
   public boolean checkWin()
   {
       if (checkRow() || checkCol() || checkDiag()) {
           return true;
       }
       return false;
   }
}
