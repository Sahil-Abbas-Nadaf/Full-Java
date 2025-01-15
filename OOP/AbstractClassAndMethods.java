abstract class Parent{
    public Parent(){
        System.out.println("i am a constructur of Parent class!");
    }

    public void sayhello(){
        System.out.println("Good Morning!");
    }

    // Abstract classes 
    abstract public void greet();
    abstract public void greet1();
}

class child1 extends Parent{
    @Override
    public void greet(){
        System.out.println("Good morning!"); 
    }
    @Override
    public void greet1(){
        System.out.println("Good Evening!");
    }
    public void hello(){
        System.out.println("Hello, World!");
    }
}

abstract class child2 extends Parent{    
    public child2(){
        System.out.println("i am child 2 constructor!");
    }
    public void th(){
        System.out.println("I am good");
    }
}

public class AbstractClassAndMethods{
    public static void main(String[] args){
        child1 c = new child1();
        c.hello();
       //parent p = new parent(); //-- error
       //child2 c2 = new child2();//-- error
    }
}
/* We can create object of Abstract class, only we can inherite abstract class.
we can create  child abstract class from parent abstract class */ 