import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class ScissorPaperStone {
    public static void main(String[] args){
        SPSRandom comp = new SPSRandom();
        Scanner scanner = new Scanner(System.in);
        Integer playerChoice = 4;
        while (playerChoice != 0){
            System.out.println("Enter (1)Stone, (2)Paper or (3)Scissors (0)Quit game: ");
            Integer compChoice = comp.generateComputerChoice();
            playerChoice = scanner.nextInt();
            if (playerChoice<=1 && playerChoice>=3){
                System.out.println("Please enter valid number: ");
            } else {
                System.out.println(comp.checkWinner(playerChoice, compChoice));
            }
        }
    }
}