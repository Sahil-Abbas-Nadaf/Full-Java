class MyThread1 extends Thread{
@Override
public void run(){//this method is present in Thread class so we override her for the code is running in councurrent manner..
    int i=0;
    while(i<40000)
    System.out.println("My cooking Thread is running....");
    System.out.println("I am Happy.");
    i++;
}
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<40000)
        System.out.println("Thread2 for Chatting with her...");
        System.out.println("I am sad.");
        i++;
    }
    }

public class MultiThreading{
    public static void main(String[] args) {
       MyThread1 t1 = new MyThread1();
       MyThread2 t2 = new MyThread2();
       t1.start();//start--> the start method call the run method internly and 
                  //we need to write start method for running the thread which is present in the code.
       t2.start();   
    }
}