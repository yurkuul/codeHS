public class TicTacToe
{
   //an integer to keep track of whose turn it is
   private int turn;
   //2D array to keep track of the board
   private char[][] board = {{' ', '0', '1', '2'},
                            {'0', '-', '-', '-'},
                            {'1', '-', '-', '-'},
                            {'2', '-', '-', '-'}};
   /**
   *  Constructor for TicTacToe
   *
   */
   public TicTacToe () {
       turn = 0;
   }
   
   /**
   *  Returns the value of turn
   *  
   *  @return - the value of turn
   */
   public int getTurn() {
       return turn;
   }
   
   /**
   *  Prints out the board for the game based on what has been filled out (if applicable)
   *
   */
   public void printBoard() {
       for (int r = 0; r < board.length; r++) {
           for (int c = 0; c < board[r].length; c++) {
              System.out.print (board[r][c] + " ");
           }
           System.out.println();
       }
   }
   
   /**
   *  Checks to see if the location inputted is a valid space on the board (a location that is empty/unfilled) and returns true if it's free
   *
   *  @Param - int row - the row on the board
   *  @Param - int col - the column on the board
   *  @return - returns true if the location inputted is an available space, otherwise returns false
   */
   public boolean pickLocation(int row, int col) {
       return board[row+1][col+1] == '-';
   }
   
   /**
   *  Sets the location inputted to the proper value based on whose turn it is. Modulus is used to determine if it's player 1 or player 2's turn based on if the turn is even or odd.
   *
   *  @Param - int row - the row on the board
   *  @Param - int col - the column on the board
   */
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
