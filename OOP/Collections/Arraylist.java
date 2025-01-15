import java.util.*;
public class Arraylist{
    public static void main(String[] args) {
    // ArrayList<Integer> list = new ArrayList<Integer>(); --> This ok for making 
    // ArrayList in java
    // Another way is to making ArrayList is : shown in below
        ArrayList<Integer> list = new ArrayList<>();//==> this is also ok to make arraylIst
        ArrayList<Integer> list2 = new ArrayList<>(5);//-->  5 is the size of the ArrayList
    // The methods are present in the collection topic are:
    // 1. Add method: this method add the element in the list also it able to add element 
    //    in specific position
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(7);
        list2.add(11);
        list2.add(12);
        list2.add(13);
        System.out.println(list2.size());
        // output : 3
    // When you want to print the list then you need to print or write only ArrayList's 
    // Object name.
    // System.out.println(list);
    // Another way to print list: for accessing the element from the list we can use 
    // get Method to access any specific element which is present on perticular index 
        for(int i = 0; i<list.size();i++){
            System.out.print(list.get(i)+", ");
        }
        System.out.println();
        // output is : 1 2 3 5 7

    // we can able to add a element in specific index : method format is add(index,element)
        list.add(3,4);
        list.add(5,6);
        list.add(0,0);
        System.out.println(list);
        // output is : [0, 1, 2, 3, 4, 5, 6, 7]
    // This method is used for adding elements of list2 in list :
        list.addAll(list2);
        System.out.println(list);
         // output is :[0, 1, 2, 3, 4, 5, 6, 7, 11, 12, 13]

        list.addAll(0,list2); // you can also able to write where i want to add mean you can 
        // able to mention index where the elements are going to add
        System.out.println(list);
         // output is :[11, 12, 13, 0, 1, 2, 3, 4, 5, 6, 7, 11, 12, 13]

        // clear() --> which is used for removing the elements from the list, it's can't 
        // be delete list, the list still present in empty state when we removing element from
        // then list of size goes to 0. 

        //System.out.println(list2.size());
        list2.clear();// clear() --> which is used to remove all the element form perticular list
        //System.out.println(list2.size());

        // isEmpty() -> return true if the list contain no elements
        System.out.println(list2.isEmpty());
        // Output : true

        // size is the method gives you size of Arraylist:
        System.out.println(list2.size());
        // output : 0

        // contains() --> is used for checking the element is present in the list or not
        System.out.println(list.contains(6));
        // Output : true
        System.out.println(list.contains(27));
        // Output : false

        // indexOf() --> which returns the index number of the element, index starts from 0
        System.out.println(list.indexOf(7));
        // Output : 10
        System.out.println(list.indexOf(169));
        // Output : -1

        // lastIndexOf() --> which searching element from the last:
        list.add(6);
        System.out.println(list.indexOf(6)); // it gives you first index
        // Output : 9
        System.out.println(list.lastIndexOf(6));// it gives you last index
        // Output : 14

        // set() --> is used for change the value of perticular index position 
        // for example :
        list.set(2,-1);
        System.out.println(list);
         // Output : [11, 12, -1, 0, 1, 2, 3, 4, 5, 6, 7, 11, 12, 13, 6]

        // remove() --> remonve the element at the specified position in this list.
        list.remove(0);
        list.remove(1);  // important note please see carefully what is happened in this time
        list.remove(0);
        System.out.println(list);
        // Output : [0, 1, 2, 3, 4, 5, 6, 7, 11, 12, 13, 6]

    }
}