import java.util.Scanner;
class EvenOddTernary{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer Number:: ");
        int n = sc.nextInt();
        String result;
        result = (n % 2 == 0) ? "Even" : "Odd" ;
        System.out.println(result);
    }
}