import java.util.Scanner;
import java.util.Random;

class Game{
   public int number;
   public int userInput;
   public int noofguesses = 0;
    public Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    void takeInput(){
        System.out.println("Guess the Number:");
        Scanner sc = new Scanner(System.in);
        userInput = sc.nextInt();
    }

    // public int getNoOfGuesses(){
    //     return noofguesses;
    // }

    // public void setNoOfGuesses(int noofguesses){
    //     this.noofguesses = noofguesses;
    // }

    public boolean isCorrectNumber(){
        noofguesses++;
        if(number == userInput){
            System.out.format("yes you guess it right, it was %d\nYou guessed it in %d attempts.", number,noofguesses);
            return true;
        }
        else if(number > userInput){
            System.out.println("Too low...");
        }
        else if(number < userInput){
            System.out.println("Too high...");
        }
        return false;
    }
}
public class guessno2{
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;

        while(!b){
            g.takeInput();
            b = g.isCorrectNumber();
        }
    }
}