class MethodOverloading{
    static void foo(/*These are parameters*/){// for ex int ,float,double,char ; 
        // parameters are not known when passing arrguments then value comes in parameters
        System.out.println("Good Morning Bro!\n");
    }

    static void foo(int a){
        System.out.println("Good Morning "+a+" Bro!\n");
    }

    static void foo(int a,int b){
        System.out.println("Good Morning "+a+" Bro!");
        System.out.println("Good Morning "+b+" Bro!\n");
    }
    static void foo(float a,float b){
        System.out.println("Good Morning "+a+" Bro!");
        System.out.println("Good Morning "+b+" Bro!\n");
    }
    static void foo(int a,int b,int c){
        System.out.println("Good Morning "+a+" Bro!");
        System.out.println("Good Morning "+b+" Bro!");
        System.out.println("Good Morning "+c+" Bro!\n");
    }
    public static void main(String[] args) {
     foo(/*these are arrguments*/); // argumnets are actual.means values are getting from the user 
     foo(3000);
     foo(2000.0f,4000.0f); 
     foo(2000,4000); 
    foo(2000,4000,6000); 
    }
}
/* Method overloading done by two ways that are 
1. Number of arrguments 
2. throw change with different types of datatypes;

we can not create method Overloading throw changing by return datatype means void,int etc.
*/