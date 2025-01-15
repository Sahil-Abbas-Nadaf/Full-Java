// For Anonymus class
// interface DemoAno{
//     public void meth1();
//     public void meth2();
// }

// For Lamda Expresions:
@FunctionalInterface 
interface DemoAno{
    public void meth1(int a );
}
//  class Sahil implements DemoAno{
//      @Override
//      public void meth1(){
//          System.out.println("This is Method 1");
//      }
//  }

// For Anonymus Class
// class AnonyDemo implements DemoAno{
//     public void show(){
//         System.out.println("Hello, World!");
//     }

//     @Override 
//     public void meth1(){
//         System.out.println("I am Meth 1");
//     }

//     @Override 
//     public void meth2(){
//         System.out.println("I am Meth2");
//     }
// }
public class LambdaExpresions{
    public static void main(String[] args) {
        // AnonyDemo da = new AnonyDemo();  // When we make the reference of the AnonyDemo which is conctrete class then and then only we can able to call the methods of the AnonyDemo. It is Accepted
        // DemoAno da = new AnonyDemo();// if we make the reference of the DemoAno the we cant able to call the show method which is present in the AnonyDemo. Please note that is the important part in this module
        // This is also correct or you can say Accepted
        // da.show();
        // da.meth1();
        // da.meth2();
     // Anonyms class : 
     // Why we need to make Anony class : ek local class sirf ek baar or at time one object ke liye banana chahiye to Anonymus class use kar sakate hai
     //aap aur jada classes ko apne package me mat add kare balki Anonymus class use kare!

    //  DemoAno dA = new DemoAno(){
    //      @Override 
    //      public void meth1(){
    //          System.out.println("This is Meth 1");
    //      }
         
    //      @Override
    //      public void meth2(){
    //          System.out.println("This is Meth 2");
    //      }
    //  };
    //  dA.meth1();
    //  dA.meth2();

    //  Lamda Expresions: Aap lamda expresion ka istemal kar sakte ho directly ek yese interface ko
    // implement karne wali class ka object banane ke liye jiska sirf ek method hai
        // DemoAno da = new Sahil();
        // da.meth1(); itna kuch karne ki jarurat nahi hai aap ek hi line me ise override kar sakte ho jaise 
       
        DemoAno obj = (a)->{ System.out.println("This is the method 1 using Lamda Expresion! - "+a); };
        obj.meth1(10);
    }
}