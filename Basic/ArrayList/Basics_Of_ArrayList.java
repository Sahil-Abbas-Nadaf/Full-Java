import java.util.ArrayList;
import java.util.Collections;
class Basics_Of_ArrayList{
    public static void main(String[] args) {
       // Integer | Float | String | Boolean we can pass this types of datatype classes
        ArrayList<Integer> list = new ArrayList<Integer>();
       ArrayList<Integer> list = new ArrayList<Integer>();
       ArrayList<Float> list1 = new ArrayList<Float>();

       add element
       list.add(0);
       list.add(2);
       list.add(3);

       System.out.println(list);

       // get elements
       int x = list.get(1);
       System.out.println(x);

       // To add element in between
       list.add(1,1);
       System.out.println(list);

        // set element
        list.set(0,5);// passing index and data
       System.out.println(list);

       // To delete element 
       list.remove(3); // we can delete element by the index passing
       System.out.println(list);

       int size = list.size();
       System.out.println(size);

       // loops
       for(int i=0; i<list.size(); i++){
       System.out.print(list.get(i)+" ");
       }
       System.out.println();

       // sorting the list of array
       Collections.sort(list);
       System.out.println(list);

       for(int i = 0;i<5;i++){
           list.add(i);
       }
       for(int i = 0;i<5;i++){
        System.out.print(list.get(i)+" ");
    }
    } 
}