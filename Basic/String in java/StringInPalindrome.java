import java.util.*;
public class StringInPalindrome{
        public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Enter a String :: ");
                    String str = sc.nextLine();
                    char charArray[] = str.toCharArray();
                    int size = str.length();
                    String reverse="";
                    for(int i=(size-1); i>=0; i--){
                       reverse = reverse + charArray[i];
                    }
                    if(str.equals(reverse)){
                        System.out.println("Yes, It's Palindrome!");
                    }
                    else{
                        System.out.println("No, It's not a Palindrome!");
                    }
        }
}
// THANK YOU SO MUCH ALLAH SUBAHANWATAALA
// TAKBIR ALLAH HU AKBAR.................!
