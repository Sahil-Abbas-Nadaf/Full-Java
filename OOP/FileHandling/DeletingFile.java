import java.io.*;
import java.util.*;

public class DeletingFile{
    public static void main(String[] args) {
        try{
                 File f = new File("First File.txt");
                 if(f.delete()){
                     System.out.println("The File is Successfuly Deleted - "+ f.getName());
                 }else{
                     System.out.println("The some problem is occured while deleting "+ f.getName()+"file!");
                 }
        }catch(Exception e){
                e.printStackTrace();
        }
    }
}