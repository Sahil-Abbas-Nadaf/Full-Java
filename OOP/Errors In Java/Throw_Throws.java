class NegativeRadiusException extends Exception{
    public String toString(){
        return "Radius can not be negative!";
    }
    public String getMessage(){
        return "Radius cannot be negative!";
    }
}

public class Throw_Throws{
   
    public static double area(int r) throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
            double result = Math.PI * r * r;
            return result;
    }
    public static int divide(int a, int b) throws ArithmeticException
    {
        // Created by Harry 
        int result = a/b;
        return result;
    }

    public static void main(String[] args) {
       // Sahil - uses divide function created by Harry
       try{
            // int c = divide(6,0);
            // System.out.println(c);
            double ar = area(-1);
            System.out.println(ar);
       }
       catch(Exception e){
            System.out.println("Exception Occured!");
            System.out.println(e.getMessage());
       }
    }
}
/* WHY WE USE THROW AND THROWS :
    Throw : throw is used for throwing the Exception, if that is custom or Built in ,it can able to throw any of Exception but deprnds on developer.
    Throws : it defines that or awaring to the developer or coder ki this event will occure in future.or hindi me bole to 
             throws jo hai vo sanket dene ka kam kartay ki is function me ye exception throw ki ja sakti hai.bas aur kuch nahi
*/