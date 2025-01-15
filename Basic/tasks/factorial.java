import java.util.Scanner;
class factorial{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the integer number :: ");
        int n = s.nextInt();
        int fact = 1;
        // using for loop
        // for(int i = n ; i>=1 ; i--){
        //     fact *= i; 
        // }
        
        //using While loop
        int i = n;
        while(i>=1){
            fact *= i;
            i--;
        }
        System.out.println("The Factoria of given number is :: "+fact);
    }
}