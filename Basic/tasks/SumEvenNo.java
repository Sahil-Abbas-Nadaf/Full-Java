import java.util.Scanner;
class SumEvenNo{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("How many even numbers is going to be add :: ");
        int n = s.nextInt();
        int sum = 0;
        for(int i = 1 ; i <=n ; i++) {
            sum += (2 * i);
        }
        System.out.println("\nSum is :: "+sum);
    }
}