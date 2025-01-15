import java.util.Scanner;
public class BasicOperations{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch[] = new char[5];
        
        // when we need to find the length of character array then
        // // System.out.println(ch.length);

        System.out.println("Enter the 5 Character: ");
        for(int i=0; i<ch.length; i++){
            ch[i] = sc.next().charAt(0);
        }
        System.out.print("The 5 Characters are : ");
        for(int i = 0; i<ch.length; i++){
            System.out.print(" "+ch[i]);
        }

        // you not get confuse about string concepts and char concept that is why i performed this operation.
        // In string the length() function will run easily but we cant run as name.length 
        String name = sc.next();
        System.out.println(name.length());
    }
}