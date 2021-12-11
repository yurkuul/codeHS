public class TicTacToe {
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
}
