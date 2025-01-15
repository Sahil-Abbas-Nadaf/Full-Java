import java.util.Scanner;
class MaxInputException extends Exception{
    public String toString(){
        return "Maximun Input Exception Occured!";
    }
    public String getMessage(){
        return "Maximun Input Exception Occured!";
    }
}

class MaxMultiplierReachedException extends Exception{
    public String toString(){
        return "Max Multiplier Reached Exception Occured!";
    }
    public String getMessage(){
        return "Max Multiplier Reached Exception Occured!";
    }
}

class InvalidInputException extends Exception{
    public String toString(){
        return "Invalid input Exception!";
    }

    public String getMessage(){
        return "Invalid input Exception!";
    }
}

public class ExcerciseNo6_Calculator{
    public static void main(String[] args)throws MaxInputException,MaxMultiplierReachedException,InvalidInputException,ArithmeticException,IllegalArgumentException {
        /* Exercise 6: You have to create a custom calculator with following operations
        1. + -> Addition
        2. - -> Subtraction
        3. * -> Multiplication
        4. / -> Division
        which throws the following Exceptions 
        1. Invalid input Exception -> ex: 8  &  9 =  ?
        2. Cannot divide by zero Exception
        3. Max Input Exception if any of the inputs is greater than 100000
        4. Max Multiplier Reached Exception -> Don't allow any multiplication input to have greater than 7000
        */
        /*******************************SOLUTION***************************** */
        Scanner sc = new Scanner(System.in);
        int a,b;
        char operator;
        do{
            System.out.println("************** MENU ***********");
            System.out.print(" '+' -> Addition\n '-' -> Subtraction\n '*' -> Multiplication\n '/' -> Division\n '$' -> Exit\n");
            System.out.print("Enter the first Number:: ");
            a = sc.nextInt(); 
            System.out.print("\nEnter the Operator:: ");
            operator = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("\nEnter the Second Number:: ");
            b = sc.nextInt(); 
            try{
                if(a > 100000 || b > 100000){
                        throw new MaxInputException();             
                }
                if((a>7000 || b>7000) && (operator == '*')){
                        throw new MaxMultiplierReachedException();
                }
                if((operator != '+') && (operator != '-') && (operator != '*') && (operator != '/')){
                        throw new InvalidInputException();
                }
                switch(operator){

                    case '+': System.out.println("Answer = "+(a+b));
                              break;
            
                    case '-': System.out.println("Answer = "+(a-b));
                              break;

                    case '*': System.out.println("Answer = "+(a*b));
                              break;

                    case '/': System.out.println("Answer = "+(a/b));
                              break;
                    
                    case '$': break;
                }
            }catch(ArithmeticException e){
                System.out.println("The Arithmetic Exception is occured!");
                System.out.println(e);
            }catch(IllegalArgumentException e){
                System.out.println(e);
            }
        }while(operator != '$');

    }
}
