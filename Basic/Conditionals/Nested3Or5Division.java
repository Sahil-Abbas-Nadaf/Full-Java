import java.util.Scanner;

class Nested3Or5Division
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number:: ");
        int num = sc.nextInt();

        if(num % 5 == 0 )
        {
            if(num % 3 == 0)
            {
                System.out.println("The Number is Divisible by Both.");
            }
            else
            {
                System.out.println("The number is not divisible by both");
            }
        }
        else{
             System.out.println("The number is not divisible by both");
        }
    }
}