import java.util.Scanner;
interface Bicycle{
    int speed = 7;//this variable is bydefault final , that is why this is redundant;
    // In Interface each and every properties is final we cannot able to modify
    void applyBreak(int decrement);
    void applySpeed(int increment);
}

interface hornBicylcle{
    void blowHornMainHooNa();
    void blowHornk3g();
}

class Hero implements Bicycle, hornBicylcle{
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo.");
    }
    public void applyBreak(int decrement){
        System.out.println("Break is Applyed ");
    }
    public void applySpeed(int increment){
        System.out.println("SpeedUp is Applyed ");
    }
    public void blowHornMainHooNa(){
        System.out.println("Main Hoo Na po po po");
    }
    public void blowHornk3g(){
        System.out.println("Kabhi Kushi Kabhi Gam pee pee pee");
    }
}
public class Interface{
    public static void main(String[] args) {
        // Bicycle b = new Hero();// it is accepted
        Hero c = new Hero();
        c.applyBreak(5);
        c.applySpeed(10);
        // You can create properties in Interafaces
        System.out.println(c.speed);
        // You cannot modify the properties in Interfaces as they are final
        //c.a= 34; // throws an error because this variable is final
        c.blowHornk3g();
        c.blowHornMainHooNa();
        c.blowHorn():
    }