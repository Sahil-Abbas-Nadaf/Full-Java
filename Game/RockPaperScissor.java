import java.util.Scanner;
import java.util.Random;

class RockPaperScissor{
    public static void main(String[] args) {
        // 0 -> Rock
        // 1 -> Paper
        // 2 -> Scissors
        Scanner s = new Scanner(System.in);
        System.out.print("Enter 0 for rock, 1 for paper, 2 for scissors : ");
        int userInput = s.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);

        if(userInput == computerInput){
            System.out.println("Draw");
        }
        else if(userInput == 0 && computerInput == 2 || userInput == 1 && computerInput==0 || userInput == 2 && computerInput == 0){
            System.out.println("You Win!");
        }
        else{
            System.out.println("Computer Win!");
        }
        //System.out.println("Computer Choice: "+computerInput);

        if(computerInput == 0){
            System.out.println("Computer Choice: Rock");
        }else if(computerInput == 1){
            System.out.println("Computer Choice: Paper");
        }else if(computerInput == 2){
            System.out.println("Computer Choice: Scissors");
        }
    }
}