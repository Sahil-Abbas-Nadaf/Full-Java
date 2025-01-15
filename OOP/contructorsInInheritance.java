class Base {
    public int x;
     public Base(){
        System.out.println("I am Base class constructor");
     }

     public Base(int x){
         System.out.println("I am overloaded constructor of base class with value of X as :: "+ x);
     }
 }

 class Derived extends Base{
     public int y; 
     public Derived(){
        System.out.println("I am Derived class constructor");
     } 

     public Derived(int x, int y){
         super(x);// super is a reference variable used to refer immediate parent class object
         System.out.println("I am overloaded constructor of derived class with value of Y as :: "+ y);
     }
 }

 class childOfDerived extends Derived{
     public childOfDerived(){
        System.out.println("I am childOfDerived class constructor");
     }

     public childOfDerived(int x, int y, int z){
        super(x,y);
        System.out.println("I am overloaded constructor of childOfDerived class with value of Z as :: "+ z);
     }
 }
 
 public class contructorsInInheritance{
     public static void main(String[] args) { 
// Base b = new Base();
//create an class which is derived from another class 
//when we run the code then first the constructor of parent class 
//will be executed then constructor of child class will be executed
        // Derived d = new Derived();
        // Derived d1 = new Derived(7,14);
        //childOfDerived cd = new childOfDerived();
        childOfDerived cd1 = new childOfDerived(1,2,3);
     }
 }
 
 /* constructor during constructur overloading 
 when there are multiple contstructors in the parent class the constructor 
 without any parameter called from the child class,
 if we want to call the constructor with parameters from the parent class we can 
 use super class.*/