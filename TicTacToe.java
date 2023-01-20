public class TicTacToe {
    public void printBoard(String[] board){
        System.out.println("|---|---|---|");
        System.out.printf("|-%s-|-%s-|-%s-|\n",board[0],board[1],board[2]);
        System.out.println("|-----------|");
        System.out.printf("|-%s-|-%s-|-%s-|\n",board[3],board[4],board[5]);
        System.out.println("|-----------|");
        System.out.printf("|-%s-|-%s-|-%s-|\n",board[6],board[7],board[8]);
        System.out.println("|---|---|---|");
    }
    public String checkWinner(String[] board){
        String line = "";
        int i = 0;
        while (i<8){
            switch(i){
                case 0: line = board[0] + board[1] + board[2]; //Top row
                    break;
                case 1: line = board[3] + board[4] + board[5]; //Mid row
                    break;
                case 2: line = board[6] + board[7] + board[8]; //Bottom row
                    break;
                case 3: line = board[0] + board[3] + board[6]; //Left col
                    break;
                case 4: line = board[1] + board[4] + board[7]; //Mid col
                    break;
                case 5: line = board[2] + board[5] + board[8]; //Right col
                    break;
                case 6: line = board[0] + board[4] + board[8]; //Right diagonal
                    break;
                case 7: line = board[2] + board[4] + board[6]; //Left diagonal
                    break;
            }
            i ++;
        }
        return "";
    }
}
