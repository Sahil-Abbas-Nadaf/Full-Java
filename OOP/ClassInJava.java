// One thing you should remember that a java file has only one public class
//otherwise compiler gives you an error

class Employee{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("My id is :: "+ id);
        System.out.println("and My name is :: "+name);
    }
    public int getsalary(){
        return salary;
    }
}

public class ClassInJava{
    public static void main(String[] args) {
        System.out.println("This is our custom class.");
        Employee sahil = new Employee();//Instantiating a new employee object 
        Employee sabiya = new Employee();
        // setting attributes for sahil
        sahil.id = 906;
        sahil.name = "Sahil Nadaf";
        sahil.salary = 80;
         
        // setting attributes for sabiya
        sabiya.id = 11;
        sabiya.name = "Sabiya Abbas Nadaf";
        sabiya.salary = 100;


        //printing the attributes
        //System.out.println(sahil.id);
        //System.out.println(sahil.name);
        sahil.printDetails();
        int salary = sahil.getsalary();
        System.out.println("salary:: "+salary);
        sabiya.printDetails();

    }
}