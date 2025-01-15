import java.io.*;
import java.util.*;

public class CreateFile{
    public static void main(String[] args) {
        File f = new File("First File.txt");
        try{
            f.createNewFile();
        }catch(Exception e){
            System.out.println("Unable to create a file");
            e.printStackTrace();
        }
    }
}