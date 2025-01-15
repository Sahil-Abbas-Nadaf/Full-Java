import java.util.Scanner;

public class addtwonum {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter 1st Num:: ");
        int num1 = sc.nextInt();

        System.out.println("Enter 12nd Num:: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum:: " + sum);
    }
}