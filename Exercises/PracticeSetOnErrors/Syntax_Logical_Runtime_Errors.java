import java.util.Scanner;
class MaximunRetriveException extends Exception{
    public String toString(){
        return "Maximum Retrive Reached!";
    }
    public String getMessage(){
        return "Maximum Retrive Reached!";
    }
}
public class Syntax_Logical_Runtime_Errors{
    public static void main(String[] args) {
        // Problem 1 :
        // Syntax Error - int a = 7
        // Logical Error :
        // int age = 78;
        // int year_born = 2000 -78; // Karana kuch chahate te aur ho kuch aur hi gaya 
        // mean what you write a logic for solution is wrong.
        // Runtime Error:
        // System.out.println(6/0);

        // Problem 2 :
        /*try{
            int a = 6/0;
            System.out.println(a);
            int b = 3/2;
            System.out.println(b);
        }
        catch(ArithmeticException e){
            System.out.println("HaHa");
        }
        catch(IllegalArgumentException e){
            System.out.println("Hehe");
        }*/
        
        //Problem no 3:
        boolean flag = true;
        int marks[] = new int[3];
        marks[0] = 7;
        marks[1] = 27;
        marks[2] = 36;
        Scanner sc = new Scanner(System.in);
        int index,i=0;
        while(flag && i<=5){
            try{
                if(i==5){
                    throw new MaximunRetriveException();
                }
                try{
                    System.out.println("Enter the value of index:: ");
                    index = sc.nextInt();
                    System.out.println("The value of marks[index] is "+marks[index]);
                    break;
                }
                    catch(Exception e){
                    System.out.println("Invalid Index!");
                    i++;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
                break;
                
            }
        }
    }
}
