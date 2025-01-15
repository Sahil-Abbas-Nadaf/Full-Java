import java.util.Scanner;
class StreamOfNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:: ");
        int num= sc.nextInt();
        int sum = 0;
        while(num != -1)
        {
            sum = sum + num;
            System.out.println("Enter Number which you want to add else type (-1):: ");
            num = sc.nextInt();
        }
        System.out.println("Total = "+sum);
    }
}
