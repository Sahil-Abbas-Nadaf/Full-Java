import java.io.*;
import java.util.*;

public class FileHandling{
    public static void main(String[] args) {
        // Code to create a new file: 
        File myFile = new File("Hello.txt");
         try{
             myFile.createNewFile();
         }catch(Exception e){
             System.out.println("Unable to create this file");
            e.printStackTrace();
         }

        //  Code to write to a file:
        try{
         FileWriter fileWriter = new FileWriter("Hello.txt");
         fileWriter.write("Hello Java Developers\n My name is Sahil Abbas Nadaf\n Now I am in Third year\n in this year i have learn Complete java course.\n Thank you!");
         fileWriter.close();
        }catch(Exception e){
            System.out.println("Unable to write on this File");
            e.printStackTrace();
        }


        //  Readin a file:
        File myFile = new File("Hello.txt");
        try{
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        

        //  Deleting a file:
        File myFile = new File("Hello.txt");
        if(myFile.delete()){
            System.out.println("I Have Deleted: "+myFile.getName());
        }
        else{
            System.out.println("Some error/Problem occured while deleting a file");
        }

        
    }
}