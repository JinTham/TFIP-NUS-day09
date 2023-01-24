import java.util.Random;

public class SPSRandom {
    public Integer generateComputerChoice(){
        Random rand = new Random();
        return rand.nextInt(3)+1;
    }
    public String checkWinner(Integer playerChoice, Integer computerChoice){
        if (((playerChoice-computerChoice)%3+3)%3==1){
            return "Player wins";
        } else if (((playerChoice-computerChoice)%3+3)%3==2){
            return "Computer wins";
        } else {
            return "It's a tie";
        }
    }
}

