@FunctionalInterface
interface myFunctionalInterface{

    abstract void thisMethod();
}

class c1{
    public void run(){
        System.out.println("The bike is running!");
    }
}

class c2 extends c1{

    @Override
    public void run(){

        // super.run(); --> when we tries to call the upper run method then you can use super() keyword!
        System.out.println("Gear Changed!");
    }
    @Deprecated
    public int add(int a , int b){
        return a+b;
    }
}


public class JavaAnnotation{

    @SuppressWarnings(" deprecation ")
    public static void main(String[] args) {

        c2 c = new c2();
        c.run();
        c.add(5,6);

    }
}

