class Employee {
    int salary; 
    String name;

    public int getsalary(){
        return salary;
    }
    public String getname(){
        return name;
    }
    public void setname(String n){
        name = n;
    }
}

class cellphone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling Sahil...");
    }
}

class Square{
    int side;

    public int area(){
        return side * side;
    }
    public int peremeter(){
        return 4 * side;
    }
}

class Rectangle{
    int length;
    int width;

    public float area(){
        return length * width;
    }
    public float peremeter(){
        return 2*(length + width);
    }
}
public class PracticeOfClass{
    public static void main(String[] args) {
        //problem 1;
        /*Employee sahil = new Employee();
        sahil.setname("sahil abbas nadaf");
        System.out.println(sahil.getname());
        sahil.salary = 233; 
        System.out.println("Salary :: "+sahil.getsalary());
        sahil.setname("sahil");
        System.out.println("The changed name is :: "+sahil.getname());

        cellphone vivo = new cellphone();
        vivo.callFriend();
        vivo.vibrate();
        vivo.ring();
        

        Square s = new Square();
        s.side = 2;
        System.out.println("The Area Of Square is ::  "+s.area());
        System.out.println("The Peremeter of Square is :: "+s.peremeter());
        
        Rectangle r = new Rectangle();
        r.length = 10;
        r.width = 10;
        System.out.println("The Area Of Rectanle :: "+r.area());
        System.out.println("The peremeter of Rectangle is :: "+r.peremeter());
        */

        

    }
}