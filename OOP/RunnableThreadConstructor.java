class MyThread implements Runnable {
    public void run() {
        System.out.println("Hello, World! from " + Thread.currentThread().getName());
    }
}

public class RunnableThreadConstructor {
    public static void main(String[] args) {
        MyThread bullet1 = new MyThread();
        Thread gun1 = new Thread(bullet1, "Sahil");

        MyThread bullet2 = new MyThread();
        Thread gun2 = new Thread(bullet2, "Sabiya");

        gun1.start();
        gun2.start();

        System.out.println("The name of Thread 1 is " + gun1.getName());
        System.out.println("The id of Thread 1 is " + gun1.getId());
        System.out.println("The name of Thread 2 is " + gun2.getName());
        System.out.println("The id of Thread 2 is " + gun2.getId());
    }
}
