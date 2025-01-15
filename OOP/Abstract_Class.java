abstract class Bike{
    abstract void run();
}
class Honda extends Bike{
    void run(){
        System.out.println("Running Safely.....");
    }
}
public class Abstract_Class{
    public static void main(String[] args) {
        // In that case referce is Bike and object of honda 
        Bike b = new Honda();
        b.run();

        // In that case referce is Honda and also object of Honda 
        Honda h = new Honda();
        h.run();
    }
}