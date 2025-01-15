class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    public void run(){
        int i = 0;
        while(i<34){
            System.out.println("Thank you : "+ this.getName());
            i++;
        }
    }
}

public class ThreadPriorities{
    public static void main(String[] args) {
        // ready queue : t1 t2 t3 t4 t5 
        // Creating the Thread objects
        MyThread t1 = new MyThread("Sahil");
        MyThread t2 = new MyThread("Sahil2");
        MyThread t3 = new MyThread("Sahil3");
        MyThread t4 = new MyThread("Sahil4");
        MyThread t5 = new MyThread("Sahil5 (Most Important)");

        // give the priorites to the threads
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);

        // Now we executing the threads/starting the each and every thread
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}