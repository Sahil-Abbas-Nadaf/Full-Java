class MyThread extends Thread{
    public void run(){
        //only for : join method
        // int i = 0;
        // while(i<20){
        //     System.out.println("Thank you :"+this.getName());
        //     i++;
        // }

        //for inturrupt method
        while(true){
          System.out.println("Thank you: "+ this.getName());
          try{
              Thread.sleep(500);
            }catch(Exception e){
                  System.out.println(e);
              }
        }
    }
}

public class ThreadMethods{
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();
        // try{
        //     t1.join();
        // }catch(Exception e){
        //     System.out.println(e);
        // }
        t2.start();

    }
}