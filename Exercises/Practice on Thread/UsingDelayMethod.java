class GoodMorning extends Thread{
    public void run(){
        int i = 0;
        while(i<3000){
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
        while(i<3000){
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

public class UsingDelayMethod{
    public static void main(String[] args) {
        GoodMorning g = new GoodMorning();
        Welcome w = new Welcome();

        g.start();
        w.start();
    }
}