import java.util.Scanner;
class PrintNNoOfHelloWorld{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many times you want to Print:: ");
        int n = sc.nextInt();
        int i=0;
        while(i<n)
        {
            System.out.println("Hello World!");
            i++;
        }
    }
}