import java.util.Scanner;
public class characterArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :: ");
        String str = sc.nextLine();
        // System.out.println("The String is "+str);
        char charArray[] = str.toCharArray();

        for(char characters:charArray){
            System.out.print(characters+" ");
        }
        int size = str.length();
        //System.out.println("\n"+(size-1));

        String reverse="";
        for(int i=(size-1); i>=0; i--){
           reverse = reverse + charArray[i];
        }
        System.out.println("\nThe Reverse String is :: "+reverse);
        if(str.equals(reverse)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}