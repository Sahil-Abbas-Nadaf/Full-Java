import java.util.Scanner;

public class ReadChar
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Any Character:: ");
        char ch = sc.next().charAt(0);

        System.out.println("Cheracter is:: " + ch);


        System.out.println("Enter Any Character:: ");
        char ch1 = sc.next().charAt(2);

        System.out.println("Cheracter is:: " + ch1);
    }
}