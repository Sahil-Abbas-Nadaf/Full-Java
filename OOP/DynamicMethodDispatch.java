class Phone{
    public void showTime(){
        System.out.println("Now time is 8 am");
    }
    public void on(){
        System.out.println("Turning on phone...");
    }
}

class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music....");
    }

    public void on(){
        System.out.println("Turning on SmartPhone...");
    }
}

public class DynamicMethodDispatch{
    public static void main(String[] args) {
        // Phone p = new Phone();// allowed 
        // p.print();
        // SmartPhone sm = new SmartPhone();// allowed
        // sm.print();

        Phone p1 = new SmartPhone();// yes it is allowed
        //smartphone sm1 = new Phone();// it is not allowed
        p1.showTime();// allowed
        p1.on();// allowed
        //p1.music();// not allowed

        // jab bhi new keyword se object banate hai to object runtime 
        //me ban jata hai
    }
}