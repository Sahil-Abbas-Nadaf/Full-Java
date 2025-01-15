package lang_util_io_package;
// import java.lang.System;-->this is by default package present in java, because without this 
// package we can able to write a single line of code of java. so no mandatory to import this package.thank you for reading.
// other all packages which are exists in java all are need to be imported, whenever you want because these are not a by default packages in java.
// below are packages which created by java developer so that is why these called as by default packages.
import java.lang.System;
import java.lang.String;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileReader{
    
    public static void main(String[] args) {

        try{
            File r = new File("C:\\Users\\Administrator\\Desktop\\DemoFile.txt");
            Scanner sc = new Scanner(r);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }

        catch(IOException e){
            System.out.println("Exception is Handled....!");
        }

    }
}