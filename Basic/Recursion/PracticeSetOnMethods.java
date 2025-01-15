
import java.util.Scanner;

class PracticeSetOnMethods{
    static void table(int n){
        for(int i = 1 ; i<= 10 ; i++){
            // System.out.println(n+" X "+i+" = "+ (i*n));
            System.out.format("%d X %d = %d\n",n,i,n*i);
        }
    }

    static void PatternPrint(int n){
        for(int i=1 ; i<=n ; i++){ // these are rows 
            for(int j=1 ; j<=i ; j++){// these are column
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // static int result = 0;
    // static int sum(int n){
    //     if(n>0){
    //     result += n;
    //     sum(n-1);
    //     }
    //     return result;   
    // }
    // Second method to find sum of n natural numbers
    // sum(n) = 1 + 2 + 3 + ....+ n-1 + n
    // sum(n) = n + sum(n-1)
    // sum(3) = 3 + sum(2)
    // sum(3) = 3 + 2 + sum(1)
    // sum(3) = 3 + 2 + 1

     static int sum(int n){
         // base condition it is required to terminate the recursion
        if(n == 1){
            return 1;
        }
           return n + sum(n-1);
    }

    static void PatternPrint2(int n){
        for(int i=0 ; i<n ; i++){ // these are rows 
            for(int j=n-i ; j>0 ; j--){// these are column
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static void PatternPrint1_Recu(int n){
        if(n>0){
            PatternPrint1_Recu(n -1);
            for(int i = 0; i < n; i++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // PatternPrint1_Recu(3)
    // PatternPrint1_Recu(2) + 3 times star and new line 
    // PatternPrint1_Recu(1) + 2 times star and new line + 3 times star and new line
    //PatternPrint1_Recu(0)  + 1 times star and new line + 2 times star and new line + 3 times star and new line
    // then result is 
    // *
    // * *
    // * * * 

    static void PatternPrint2_Recu(int n){
        if(n>0){
            for(int i = 0; i < n; i++){
                System.out.print("* ");
            }
            System.out.println();
            PatternPrint2_Recu(n-1);
        }
    }

    //static int n1 = 0, n2 = 1, n3 = 0;
    // static void fibo(int n)
    // {
    //     if(n>0){
    //     n3 = n1 + n2;
    //     n1 = n2;
    //     n2 = n3;
    //     System.out.print(" "+n3);
    //     fibo(n-1);
    //     }
    // }
    static int fibo(int n)
    {
        if(n == 0){
            System.out.println("Invalid Input!");
            return 0;
        }
       else if(n==1 || n==2){
           return n-1;
       }
       else{
           return fibo(n-1) + fibo(n-2);
       }
    }
    static float avg = 0;
    static float average(int ...arr){
        for(int a :arr){
            avg += a;
        }
        return avg/arr.length;
    }

    static float tempToFar(float t){
    // this formula used for to convert celsius to fahrenheit
    // Formula	(0°C × 9/5) + 32 = 32°F
    float CTF = (t * 9/5) + 32;     
    return CTF;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Problem 1:
        // System.out.print("Enter integer Number:: ");
        // int n = s.nextInt();
        // System.out.println("\nThe "+n+" Table is ::");
        // table(n);

    // Problem 2: 
    // PatternPrint(n);

    //Problem 3:calculate sum of n natural numbers using recursion
    //int c = sum(n);
    //System.out.println("The Sum Of N Natural number is :: "+c);

    // Problem 4:
    //PatternPrint2(n);

    // Problem 5 : Fibonacci Series : 0, 1, 2, 3, 5, 8, 13, 21, 34
    //  System.out.print(n1+" "+n2);
    //  fibo(n-2);

    // another method to solve fibonacci
    // int f = fibo(n);
    // System.out.print(f);

    // Write a function to find average of a set of numbers passed as argument
    // float result = average(1,2,3,4,5);
    //     System.out.println("The Avarage of given values is :: "+ result);
    
    // problem 6 : problem 2 solve using recursion
   // PatternPrint1_Recu(3);

    // problem 7 : problem 4 solve using recursion
    // PatternPrint2_Recu(3);

    // problem 8 : write a function to convert temperature into fahrenheit
    float ctf = tempToFar(8.0f);
    System.out.println(ctf);
    }
}