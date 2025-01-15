import java.util.Scanner;

class NestcheckYoung{

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter Ram's Age :: ");
    int rAge = sc.nextInt();

    System.out.println("Enter Shyam's Age :: ");
    int sAge = sc.nextInt();

    System.out.println("Enter Ajay's Age :: ");
    int aAge = sc.nextInt();
    
    if(rAge<sAge)
    {
        if(rAge<aAge)
        {
            System.out.println("Ram is youngest person.");
        }
        else{
            System.out.println("Ajay is youngest person.");
        }
    }
    else{
        if(sAge<aAge){
            System.out.println("Shyam is youngest person.");
        }
        else{
            System.out.println("Ajay is youngest person.");
        }
    }
}
}