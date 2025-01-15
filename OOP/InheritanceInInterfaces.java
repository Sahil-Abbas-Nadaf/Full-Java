interface sampleInterface{
    void meth1();
    void meth2();
}

// we can't write like this 
// class className extends interface 
// the write ways to declare inheritance
// 1. class name extends class name
// 2. interface name extends interfaceName
// 3. class ClassName implements interfaceName
// 4. interface InterfaceName implements className
interface childSampleInterface extends sampleInterface{
    void meth3();
    void meth4();
}

// interface example{  this is created by me because i want to ckeck if the empty interface is designed and there is no implementation of that interface then it will run or not.
//     void hello();
// }
class sampleClass implements childSampleInterface{
    public void meth1(){
        System.out.println("Meth1");
    }
    public void meth2(){
        System.out.println("Meth2");
    }
    public void meth3(){
        System.out.println("Meth3");
    }
    public void meth4(){
        System.out.println("Meth4");
    }
}

public class InheritanceInInterfaces{
    public static void main(String[] args) {
        sampleClass sp = new sampleClass();
        sp.meth1();
        sp.meth2();
        sp.meth3();
        sp.meth4();
    }
}