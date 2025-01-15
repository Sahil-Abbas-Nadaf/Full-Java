import java.util.Scanner;
import java.util.Random;
class Game{
  public int ci; // ci means computer Input
  private int chance = 0;
   public Game(){
       Random random = new Random();
       ci = random.nextInt(100);
       }

    public int getNoOfchance(){
        return chance;
    }

    public void setNoOfchance(int n){
        chance = n;
    }
}
public class guessTheNo{
    public static void main(String[] args) {
    /*  Create a class game, which allows a user to play "Guess the Number "
        game once. game should have the following methods:
        1. Constructor to generate the random number
        2. takeUserInput() to take a user input of number
        3. isCorrectNumber() to detect wheater the number entered by the user is true
        4. getter and setter for noOfGuesses
        use properties such as noOfGuesses(int), etc to get this task done!
    */
    Game g = new Game();
    System.out.println("\t\t\t***_Guess The Number_***");
    int i = 0;
    boolean iscorrectNumber = false;
    while(iscorrectNumber!= true){                     
        g.setNoOfchance( i++);
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Integer Number:: ");
        int userInput = s.nextInt();

        if(userInput < g.ci){
            System.out.println("Number is less.");
        } 
        else if(userInput > g.ci){
            System.out.println("Number is Greater.");
        }
        else if(userInput == g.ci){
            System.out.println("Correct Number.");
            iscorrectNumber = true;
        }
    }
    System.out.println("The No of Chances Given by user :: "+ g.getNoOfchance());
   }
}