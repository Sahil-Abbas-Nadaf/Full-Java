class VarArgs{
    static int sum(int x,int ...arr){// ek compalsory arrgument pass karnahi padega that is x
        //Available as int []arr;
        int result = x;
        for(int a:arr){
        result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Varargs Tutorial!");
      //System.out.println("The Sum of Nothing : " +sum());
        System.out.println("The Sum of 1 : " +sum(1));
        System.out.println("The Sum of 4 and 5 : " +sum(4,5));
        System.out.println("The Sum of 4,5 and 6 : " +sum(4,5,6));
        System.out.println("The Sum of 4,5,6 and 7 : " +sum(4,5,6,7));
        System.out.println("The Sum of 4,5,6,7 and 8 : " +sum(4,5,6,7,8));
    }
}
/* Variable Arguments(Varargs)
 a function with varargs can be creted in java using  the following syntax

 public static void foo(int ...arr){
     //arr is available here as int arr[] :- you can pass n number of arguments in that arr[].
 }
 foo can be called with zero or more arguments like this 
 foo(7),foo(4,5),foo(2,67,4)etc.    

 we can also create a funvtion  bar like this
 public static void bar(int a, int arr)// Atleast one integer is required to pass
{
 //code
}

*/