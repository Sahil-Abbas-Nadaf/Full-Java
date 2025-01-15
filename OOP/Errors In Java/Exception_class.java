import java.util.Scanner;
class MyException extends Exception{
    public String toString(){
        return "I am toString()";
    }
    public String getMessage(){
        return "I am getMessage()";
    }

}
public class Exception_class{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the integer number: ");
       int n = sc.nextInt();
       if(n<9){
           try{
               throw new MyException();
                //   throw new ArithmeticException("This is an exception.");
           }
           catch(Exception e){
               System.out.println(e.getMessage());
               System.out.println(e.toString());
               System.out.println(e);
               e.printStackTrace();
               System.out.println("Finished.");
           }
           System.out.println("Yes, Finished!");
       }
    }
}
/*****************OUTPUT**************** 
Enter the integer number:
4
I am getMessage()// when we want to call then we need to mention this method 
I am toString()// but in toString() method, it is run by default.
I am toString()// When we run only e then the toString method is getting execute or call by default;

Another output is :
Enter the integer number:
5
I am getMessage()
I am toString()
I am toString()
I am toString()
        at Exception_class.main(Exception_class.java:18)
Finished.
Yes, Finished!

The Throw keyword : the throw keyword is used to throw an exception expetially by the programmer.
*/