import java.util.Scanner;
public class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = new String[10];
        for(int i=0; i<s.length();i++){
            s[i] = sc.nextLine();
        }
        for(int i=0; i<s.length(); i++){
            System.out.println(s[i]);
        }
    }
}