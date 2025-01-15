abstract class Pen{
    abstract void write();
    abstract void refill();
}

// Fountain is the concrete class means abstract methods + self methods
class FountainPen extends Pen{
    void write(){
        System.out.println("Writting using Pen.");
    }
    void refill(){
        System.out.println("Refilling the pen.");
    }
    void changeNib(){
        System.out.println("Changing the Nib.");
    }
    
}

class Monkey{
    void jump(){
        System.out.println("Jumping....");
    }
    void bite(){
        System.out.println("Bitting...");
    }
}

interface basicAnimal{
    void eat();
    void sleep();
}

class Human extends Monkey implements basicAnimal{
    void speak(){
        System.out.println("Hello Sir!");
    }
    public void eat(){
        System.out.println("eatting...");
    }
    public void sleep(){
        System.out.println("sleeping....");
    }
}

public class PraticeOnAbstractAndInterface{
    public static void main(String[] args) {
        // Question 1,2
        // FountainPen pen = new FountainPen();
        // pen.changeNib();

        // Question 3:
        // Human sahil = new Human();
        // sahil.sleep();

        //Quetion 5:
        // Monkey m1 = new Human();
        // //m1.speak(); --> cannot use speak method because the referece is monkey which does not have speak method
        // m1.jump();
        // m1.bite();

        // Question 4:
        // TelePhone tp = new SmartTelephone();
        // tp.ring();
        // tp.lift();
        // tp.diconnect();
        //tp.communication();//--> throws an error. we cannot use communication method because the referce is telephone

        // Question 6,7:
        Tv Samsung = new Tv();
        Samsung.changeChannel();
        Samsung.changeVolume();
    }
}
abstract class TelePhone{
    abstract void ring();
    abstract void lift();
    abstract void diconnect();
}

class SmartTelephone extends TelePhone{
    void ring(){
        System.out.println("Ringing...");
    }
    void lift(){
        System.out.println("Lift");
    }
    void diconnect(){
        System.out.println("Disconnecting....");
    }
    void communiction(){
        System.out.println("Here is Two Way Communication.");
    }
}

interface TvRemote{
    void changeChannel();
    void changeVolume();
}

interface SmartTvRemote extends TvRemote{
    void setting();
    void connectNetwork();
}

class Tv implements TvRemote{
    public void changeChannel(){
        System.out.println("Changing Channel...");
    }

    public void changeVolume(){
        System.out.println("Changing Volume...");
    }
}