import java.util.Scanner;
class SumOfNNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0,num = 1;
        System.out.println("Upto which Number of sum you want:: ");
        int n = sc.nextInt();

        while(num<=n){
            sum = sum + num;
            num++;
        }
        System.out.println(sum);
    }
}