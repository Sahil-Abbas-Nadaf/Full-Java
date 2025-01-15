// this is different way to use packages

//import java.util.Scanner;
//import java.util.*;

public class Package{
    public static void main(String[] args) {

        // we can able to call scanner class in two ways:
        // 1. Scanner s = new Scanner(System.in);
        /*2.*/java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("Enter value of a:: ");
        int a = s.nextInt();
        System.out.println("This is Scanner class taking input as "+a);
    }
}