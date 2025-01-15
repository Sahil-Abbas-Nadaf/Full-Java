import java.util.Scanner;
class SumofTable{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the integer number :: ");
        int n = s.nextInt();
        int sum = 0;
        for(int i = 0 ; i<=10 ; i++){
           sum += (n*i);
        }
        System.out.printf("Sum of Table of %d :: %d",n,sum);
    }
}
