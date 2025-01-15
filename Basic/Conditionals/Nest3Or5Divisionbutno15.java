import java.util.Scanner;

class Nest3Or5Divisionbutno15
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A numbre:: ");
        int num = sc.nextInt();

        // if(num % 5 == 0 || num % 3 == 0){
        //     if(num % 15 != 0){
        //         System.out.println("The number is divisible by 3 or 5 but not divisile by 15.");

        //     }
        //     else{
        //          System.out.println("Not Matching the required condition.");
        //      }
        // }
        // else{
        //     System.out.println("Not Matching the required condition.");
        // }
        if( num % 15 !=0 && ( num % 3 == 0 || num % 5 == 0 ) ){
            System.out.println("The number is divisible by 3 or 5 but not divisile by 15.");
        }
        
        else{
            System.out.println("Not Matching the required condition.");
        }
    }
}