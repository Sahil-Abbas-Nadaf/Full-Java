import java.util.HashSet;   
import java.util.Iterator;
public class Hashset{
    public static void main(String[] args) {
     HashSet<Integer> set = new HashSet<>();
     // Insert
     set.add(1);  
     set.add(2);  
     set.add(3);  
     set.add(1); // it directly remove from the set because it only accepts unique values
     
     // Size 
     System.out.println(set.size());

     // printing all elements
     System.out.println(set);

     //Iterator
     Iterator it = set.iterator();

     while(it.hasNext()){
         System.out.println(it.next());
     }
    }
}   