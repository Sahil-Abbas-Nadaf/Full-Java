import java.util.Scanner;
class PrintNNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers you want to print:: ");
        int n = sc.nextInt();
        
        for(int i = 0 ; i<=n ;i++)
        {
            System.out.println(i);
        }
    } 
}