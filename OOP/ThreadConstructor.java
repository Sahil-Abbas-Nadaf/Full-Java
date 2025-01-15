class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    public void run(){
        System.out.println("Hello, World!");
    }
}
public class ThreadConstructor{
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Arman");
        MyThread t2 = new MyThread("Sabiya");

        t1.start();
        t2.start();

        System.out.println("The id of the Thread 1 is "+ t1.getId());
        System.out.println("The Name of the Thread 1 is "+ t1.getName());
        System.out.println("The id of the Thread 2 is "+ t2.getId());
        System.out.println("The Name of the Thread 2 is "+ t2.getName());
    }
}