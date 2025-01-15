package sahil;
// this is for private access modifire
class Private{
    private void show(){
        System.out.println("Learn coding..!");
    }
    public static void main(String[] args) {
        A p = new A();
        p.show();
    }
}

// check for one class to another class
// for Default access modifire
//when we compling the code you need to put in terminal : javac -d . B.java
// when we run the code you need to put in terminal :java sahil.A
// class B{
//  void show(){
//         System.out.println("Learn coding..!");      
//     }
// }

// class A{
//     public static void main(String[] args) {
//         B obj = new B();
//         obj.show();  // throws an error because of the show method has private access modifire  
}
}


