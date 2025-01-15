import java.util.Scanner;
class LeapYearorNot
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Year :: ");
        int Year = sc.nextInt();

        if(Year % 4 == 0)
        {
            System.out.println("You Entered Year is a Leap Year.");
        }

        else
        {
            System.out.println("You Entered Year is Not a Leap Year.");
        }
    }
}