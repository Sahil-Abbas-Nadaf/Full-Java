class GoodMorning extends Thread{
    public void run(){
        int i = 0;
        while(i<30){
            System.out.println("Good Morning ...!");
            try{
                Thread.sleep(200);
            }catch(Exception e){
                System.out.println(e);
            }
            i++;
        }
    }
}

class Welcome extends Thread{
    public void run(){
        int i = 0; 
        while(i<30){
            System.out.println("Welcome...!");
            try{
                Thread.sleep(200);
            }catch(Exception e){
                System.out.println(e);
            }
            i++;
        }
    }
}

public class SetPriority{
    public static void main(String[] args) {
        GoodMorning g = new GoodMorning();
        Welcome w = new Welcome();
        
        // Setting Priority 
        g.setPriority(6);
        w.setPriority(9);

        // Printting priority
        System.out.println(g.getPriority());
        System.out.println(w.getPriority());

        // for checking  state of Threads means new, runnable, non-runnable terminate etc.
        System.out.println(g.getState());
        System.out.println(w.getState());

        // g.start();
        w.start();
        System.out.println(Thread.currentThread().getState());
    }
}