import java.io.*;
import java.util.*;

public class ReadFromFile{
    public static void main(String[] args) {
        try{
            File f = new File("First File.txt");
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){
                String str = sc.nextLine();
                System.out.println(str);
            }
            sc.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}