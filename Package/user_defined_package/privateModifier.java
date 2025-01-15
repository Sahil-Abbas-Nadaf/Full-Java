package pack1;
// the below code is able to run because private method has accesible within same class only.
public class privateModifier{
    private void show(){
        System.out.println("Learn Coding....!");
    }
    public static void main(String[] args) {
        privateModifier p = new privateModifier();
    p.show();
    }
}

// below side the  show() has private access in b that is why this method can't be accesible.
class b{
    private void show(){
        System.out.println("Learn Coding....!");
    }
}
public class privateModifier{
    public static void main(String[] args) {
        b p = new b();
        p.show();
    }
}