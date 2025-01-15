class welcome{

    public void print(){
        System.out.println("Good morning!");
    }

    public void print(int a){
        System.out.println("Good morning, "+a+" times!");
    }

    public void print(int a,int b){
        System.out.println("Good morning, "+a+" And "+b+" times!");
    }
}



public class MethodOverloading{
    public static void main(String[] args) {
        welcome g = new welcome();
        g.print();
        g.print(1000);
        g.print(1000,2000);

    }
}
/* method overloading :-
two or more methods can have same name
but different parameters such methods are called as method overloading.
for example
a welcome class have one method as print();

print() with no parameters 
print(int a) with one parameter
print(int a, int b) // with two parameters

rules for method overloading
 we can overload the methods in two way that are
 1. through the number of parameters
 2. through the changing the datatype of parameters

 we can not overload method by changing datatype of the method or return type
*/