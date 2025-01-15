abstract class Bike{
    public Bike(){
        System.out.println("bike is created!");
    }
    abstract void run();
    void changeGear(){
        System.out.println("Gear is changed!");
    }
}
class Honda extends Bike{
    void run(){
        System.out.println("Running Safely.....");
    }
}
public class Abstrac_class_with_body{
    public static void main(String[] args) {
        // In that case referce is Bike and object of honda 
        Bike obj = new Honda();
        obj.run();
        obj.changeGear();
    }
}