import java.util.Scanner;
class EvenOdd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A Number:: ");
        int n = sc.nextInt();

        if ( n % 2 == 0){
            System.out.println("The Entered Number is Even.");
        }

        else{
            System.out.println("The Entered Number is Odd.");
        }
    }
}