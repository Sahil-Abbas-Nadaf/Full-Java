import java.io.*;
import java.util.*;

public class WriteInFile{
    public static void main(String[] args) {
        try{
            FileWriter fileWriter = new FileWriter("First File.txt");
            fileWriter.write("Hello, My Connections !\n Welcome back to the java Course.");
            fileWriter.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
}