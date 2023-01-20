public class TTTMain {
    public static void main(String[] args){
        String[] tttBoard = new String[9];
        //Player X and O
        String player = "X";
        //Populate the tic-tac-toe board with 1 to 9
        for (int i=0;i<9;i++){
            tttBoard[i] = String.valueOf(i+1);
        }
        TicTacToe ttt = new TicTacToe();
        //Print out initial tic-tac-toe board
        ttt.printBoard(tttBoard);
        System.out.println("");
    }
}
