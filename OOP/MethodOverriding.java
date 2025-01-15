class A {
    public void meth1(){
        System.out.println(" i am in class A math1 method");
    }

    public void meth2(){
        System.out.println("I am in method 2 of class A"); 
    }
}

class B extends A{
    @Override
    public void meth2(){
        System.out.println("I am in method 2 of class B"); 
    }
}
public class MethodOverriding{
    public static void main(String[] args) {
        A a = new A();
        a.meth2();
        B b = new B();
        b.meth2();
    }
}
/* when we create a method overloading then there are some rules
1. two methods have same name
2. two methods have same parameter with same data types 
3. we can't create method overriding with static methods and also 
with final methods
