import java.util.Scanner;
public class RuntimeError{
    public static void main(String[] args) {
        //RUNTIME ERROR --> EXCEPTION 
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a/b);
    }
}