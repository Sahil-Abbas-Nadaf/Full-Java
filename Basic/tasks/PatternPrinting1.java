import java.util.Scanner;
class PatternPrinting1{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter A Integer Number:: ");
        int n = s.nextInt();

        // for(int i = n ; i > 0 ; i--)
        // {
        //     for(int j = 0 ; j < i ; j++){
        //     System.out.print("*");
        //     }
        //     System.out.print("\n");
        // }

        int i = n;
        int j = 0;
        while(i>0){
           if(j<i){
               System.out.print("*");
               j++;
           }
           else{
               i--;
               j = 0;
               System.out.print("\n");
           }
        }
    }
}