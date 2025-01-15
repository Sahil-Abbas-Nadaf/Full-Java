class EkClass{
    int a;

    EkClass(int a){
        this.a = a;
        System.out.println("I am in Ekclass constructor and setting A = "+a);
    }
    int getA(){
        return a;
    }
}

class DoClass extends EkClass{

    DoClass(int a){
        super(a);
        System.out.println("I am doclass constructor");
    }
}

public class ThisAndSuper{
    public static void main(String[] args) {
        DoClass d = new DoClass(25);
        //System.out.println(d.getA());
    }
}
/*
This:
this is a way for us to reference an object of the class which is being creted / referenced

super:
A reference variable used to refer immediate parent class object 

uses of super 
can be used to refer immediate parent class instance variable 
can be used to invoke parent class method
can be used to invoke parent class constructors */