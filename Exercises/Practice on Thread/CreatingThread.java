class GoodMorning extends Thread{
    public void run(){
        int i = 0;
        while(i<3000){
            System.out.println("Good Morning ...!");
            i++;
        }
    }
}

class Welcome extends Thread{
    public void run(){
        int i = 0; 
        while(i<3000){
            System.out.println("Welcome...!");
            i++;
        }
    }
}

public class CreatingThread{
    public static void main(String[] args) {
        GoodMorning g = new GoodMorning();
        Welcome w = new Welcome();

        g.start();
        w.start();
    }
}