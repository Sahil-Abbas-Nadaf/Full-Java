class Base {
   public int x;

    public int getX(){
        return x;
    }

    public void setX(int x){
        System.out.print("I am in Base Class and setting x = ");
        this.x = x;
    }
}

class Derived extends Base{
    public int y; 

    public int getY(){
        return y;
    }

    public void setY(int y){
        System.out.print("i am in Derived Class and setting y = ");
        this.y = y;
    }
}

public class inheritance{
    public static void main(String[] args) {
        //inheritance means a class aquires all the properties and behaviour of super class or parent class
        // creating an oject of base class 
       Base b = new Base();
        b.setX(5);
        System.out.println(b.getX()); 
        
        //creting an object of derived class and calling method from base class
        Derived d = new Derived();
        d.setX(50);
        System.out.println(d.getX()); 
        d.setY(100);
        System.out.println(d.getY()); 
    }
}