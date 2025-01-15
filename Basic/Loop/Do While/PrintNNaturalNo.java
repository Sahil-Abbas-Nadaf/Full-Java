import java.util.Scanner;
class PrintNNaturalNo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers you want to print:: ");
        int num= sc.nextInt();
        
       do{
           System.out.println(num);
           num++;
       }while(num <=10);
    }
}