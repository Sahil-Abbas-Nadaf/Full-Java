class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setId(int id){
        this.id = id;
    }
}

class AccessModifier{
    public static void main(String[] args) {
      MyEmployee e1 = new MyEmployee();
    // e1.id = 12; // throws an error due to id has private access modifier
    // e1.name = "Sahil";// throws an error due to name has privare access modifier
    
    // You can access private modifier through the methods. this things are helps to hidding data from the user  
     e1.setName("Sahil A Nadaf");
     System.out.println("The Employee Name :: "+e1.getName());  
     e1.setId(12);
     System.out.println("The Employee ID :: "+ e1.getId());
    }
}