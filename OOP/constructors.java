class MyEmployee{
    // public int id;
    // public String name;
    private int id;
    private String name;
    //constructors can Autometicaly run by compailer but other methods required to call
    // we can also overload the constractors with parameters and datatypes
    public MyEmployee(){
        id = 12;
        name = "Your_Name_Here";
    }

    public MyEmployee(String MyName,int MyId){
        id = MyId;
        name = MyName;
    }

    public MyEmployee(String MyName){
        id =1;
        name = MyName;
    }
    public String getName(){    return name;    }
    public int getId(){   return id;    }
    public void setName(String name){    this.name = name;  }
    public void setId(int id){   this.id = id;  }
}

class constructors{
    // constructor - a member function used to initialized an object while creating it
    public static void main(String[] args) {

    MyEmployee e1 = new MyEmployee(); 
    // MyEmployee e1 = new MyEmployee("SAN",906);  
    // MyEmployee e1 = new MyEmployee("SAHIL");  
    
    // initialized attributes
    //    e1.setName("Sahil A Nadaf");
    //    e1.setId(12);

    // printing the details
    System.out.println("The Employee Name :: "+e1.getName());  
    System.out.println("The Employee ID :: "+ e1.getId());


    // these through an error because e1.name and e1.id are private 
    //we can't able to access, if we want to access then you need 
    //to create methods that is getter and setter.
    // System.out.println("The Employee Name :: "+e1.name);  
    // System.out.println("The Employee ID :: "+ e1.id);

    }
}