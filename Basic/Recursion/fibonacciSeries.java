class fibonacciSeries{
    static int  n1 = 0, n2 = 1, n3 = 0;
    // static void fibo (int count){
    //     if(count>0){
    //         n3 = n1 + n2;
    //         n1 = n2;
    //         n2 = n3;
    //         System.out.print(" "+n3);
    //         fibo(count-1);
    //     }
    // }
    public static void main(String[] args){
     int count = 10 ;
     System.out.print("Fibonacci Series :: ");
     System.out.print(n1+" "+n2);
    //  fibo(count-2);
    
    // without using recursion
    // iteration starting from 2 because first two numbers are already printed
        for(int i = 2 ; i<count ; i++){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);
        }
    }
}