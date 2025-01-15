public class LogicalOperators
{
    public static void main(String[] args) {
        
        int p = 20 , q = 10 , r=30;
        // & operator
        System.out.println((p > q) && (p < r));//true
        System.out.println((p > r ) && (q > r));//flase
       
        // || operator
        System.out.println((p > q) || (p < r));//true
        System.out.println((p > r ) || (q > r));//flase
        System.out.println((p > r) || (p < r));//true
        System.out.println((p > r ) || (q > r));//flase

        // ! operator
        System.out.println( !(p > q) );//false
        System.out.println( !(p > r ) );//true
      
    }
}