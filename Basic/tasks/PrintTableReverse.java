import java.util.Scanner;
class PrintTableReverse{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the integer number :: ");
        int n = s.nextInt();
        System.out.println("Table Printting in Reverse Order.");
        for(int i = 10 ; i>=1 ; i--){
            System.out.printf("%d X %d = %d\n",n,i,n*i);
        }
    }
}