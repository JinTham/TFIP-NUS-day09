import java.util.Scanner;

public class TTTMain {
    public static void main(String[] args){
        String[] tttBoard = new String[9];
        String winner = "";
        //Player X and O
        String player = "X";
        //Populate the tic-tac-toe board with 1 to 9
        for (int i=0;i<9;i++){
            tttBoard[i] = String.valueOf(i+1);
        }
        TicTacToe ttt = new TicTacToe();
        System.out.println("TicTacToe game");
        System.out.println("--------------");
        System.out.println("X will play first");
        
        Scanner scanner = new Scanner(System.in);
        //Start game
        while (winner.equals("")){
            ttt.printBoard(tttBoard);
            System.out.printf("Player %s's turn: ",player);
            Integer input;
            input = scanner.nextInt();
            //Check input
            if (input>0 && input<10){
                //Check if the cell has been taken, if not then assign current player to this cell
                if ((tttBoard[input-1]).equals(String.valueOf(input))){
                    tttBoard[input-1] = player;
                    //Switch to next player
                    if (player.equalsIgnoreCase("X")){
                        player = "O";
                    } else {
                        player = "X";
                    }
                } else {
                    System.out.println("Position already taken, please enter another position: ");
                }
            } else {
                System.out.println("Invalid input: Only number 1 to 9 is allowed");
            }
            winner = ttt.checkWinner(tttBoard);
        }
        if (winner.equalsIgnoreCase("draw")){
            System.out.println("It's a draw");
        } else {
            System.out.printf("%s won the game",winner);
        }
        scanner.close();
    }
}
