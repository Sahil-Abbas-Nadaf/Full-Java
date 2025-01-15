class Animal{
    public void print1(){
        System.out.println("It is an Animal.");
    }
}

class Dog extends Animal{
    public void print2(){
        System.out.println("It is a Dog.");
        System.out.println("Dog is barking right now.");
    }
}

public class QuizOnInheritance{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.print1();
        d.print2();
    }
}