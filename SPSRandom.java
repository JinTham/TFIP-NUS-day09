import java.util.Random;

public class SPSRandom {
    public Integer generateComputerChoice(){
        Random rand = new Random();
        return rand.nextInt(3);
    }
    public String checkWinner(Integer playerChoice, Integer computerChoice){
        System.out.printf("Player %d vs Comp %d\n",playerChoice,computerChoice);
        System.out.printf("Result: %d\n",(playerChoice-computerChoice)%3);
        if ((playerChoice-computerChoice)%3==1){
            return "Player wins";
        } else if ((playerChoice-computerChoice)%3==2){
            return "Computer wins";
        } else {
            return "It's a tie";
        }
    }
}

