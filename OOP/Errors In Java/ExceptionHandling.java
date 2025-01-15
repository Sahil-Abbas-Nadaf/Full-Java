public class ExceptionHandling{
    public static void main(String[] args) {
        int a = 100;
        int b = 0;

        // without try :
        // int c = a/b;
        // System.out.println(c);
        
        // with try:
        try{
            int c = a/b;
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println("We failed to divide. Reason: "+e);
        }
        System.out.println("End of the program!");
    }
}