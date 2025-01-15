package cal;

class Calculator{

    public void calculate(int a, int b){
        System.out.println(a+b);
    }

    public void scintificCalculate(int a, int b){
        System.out.println(Math.sin(a+b));
    }

    public void HybridCalculate(int a, int b){
        System.out.println(a+b);
        System.out.println(Math.sin(a+b));
    }
}
public class Pro1OnPackage{
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Calculator c = new Calculator();
        c.calculate(5,8);
    }
}