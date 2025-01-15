import java.util.Scanner;

public class SimpleInterest
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle:: ");
        float P = sc.nextFloat();

        System.out.println("Enetr Rate:: ");
        float R = sc.nextFloat();

        System.out.println("Enter Time:: ");
        float T = sc.nextFloat();

        float si = (P*R*T)/100;
        System.out.println("Principle:: " + P);
        System.out.println("Rate:: " + R);
        System.out.println("Time:: " + T);
        System.out.println("Simple Interest:: " + si);
    }

}