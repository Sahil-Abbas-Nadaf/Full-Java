import java.util.*;
import java.io.*;
class myDeprecated {
    @Deprecated
    public void meth1(){
        System.out.println("This is method 1");
    }
}

@FunctionalInterface
interface MyInt{
    public void display();
}
public class Advance{
    @SuppressWarnings("deprecated")
    public static void main(String[] args) {
        
        // 1 : Create a class and add a method with deprecatedannotation what is its effect on program exection
            // Ans : this  annotation cant create empact on program and this annotation tells programer to use another method 
            // because this method is deprecated you use another method which will better for you than this

            // myDeprecated d = new myDeprecated();
            // d.meth1();
        
         // use lambda expresion:
            MyInt m = ()-> {System.out.println("This is Lambda Expression!");};
            m.display();

        //  Find any no of table and this table write into the file:
             System.out.println("Enter the Integer Number: ");
             Scanner sc = new Scanner(System.in);
             int n = sc.nextInt();
             String table = "";
             for(int i = 1; i<=10;i++){
                 table += n +"X"+ i + "="+ n*i;
                 table += "\n";
             }

             try {
                 FileWriter file = new FileWriter("MultiplicationTableGenerator.txt");
                 file.write(table);
                 file.close();
             }catch(IOException e){
                 e.printStackTrace();
             }
    }
}