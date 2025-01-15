public class FinalyBlock{
    public static int greet(){
        try{
            int a = 10;
            int b = 2;
            int c = a/b;
            return c;
        }
        catch(Exception e){
            System.out.println(e);
        }
    
        finally{
            System.out.println("Cleaning up resources..... This is the end of the function.");
        }
        return -1;
    }
    public static void main(String[] args) {
        int k = greet(); 
        System.out.println("The value of k is " + k);
        int a = 7;
        int b = 9;

        while(true){
            try{
                System.out.println(a/b);
            }
            catch(Exception e){
                System.out.println(e);
                break;
            }
            finally{
                System.out.println("I am finally for value of b is "+b);
            }
            b--;
        }
    }
}
/* 
Cleaning up resources..... This is the end of the function.
The value of k is 5
0
I am finally for value of b is 9
0
I am finally for value of b is 8
1
I am finally for value of b is 7
1
I am finally for value of b is 6
1
I am finally for value of b is 5
1
I am finally for value of b is 4
2
I am finally for value of b is 3
3
I am finally for value of b is 2
7
I am finally for value of b is 1
java.lang.ArithmeticException: / by zero
I am finally for value of b is 0

kuch bhi ho jaye finally run hoke hi rahega no matter exception handle hua hai ya nahi
it always executable.agar aapka function return ho jaye ya loop break ho jaye finally run hoye bager program end nahi hoga

Note : we cant able to write try without catch
        and we can able to write try with finally.
*/