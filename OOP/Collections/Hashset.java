import java.util.*;

public class Hashset{
    public static void main(String[] args) {
        // HashSet<Integer> myHashSet = new HashSet<>();
        // Description : Constructs a new, empty set; 
        //the backing HashMap instance has default initial capacity (16) and load factor (0.75).

        // HashSet<Integer> myHashSet = new HashSet<>(10);
        // Description : Constructs a new, empty set; the backing HashMap instance has the
        // specified initial capacity and default load factor (0.75).
        // System.out.println(myHashSet.size());

        // HashSet<Integer> myHashSet = new HashSet<>(10, 0.5f);
        // Description : Constructs a new, empty set; the backing HashMap instance has the specified
        //  initial capacity and the specified load factor.

        // HashSet<Integer> myHashSet = new HashSet<>(10, 0.5f);
        // Description : Constructs a new, empty set; the backing HashMap instance has the specified
        //  initial capacity and the specified load factor.

        // // Create a list with some duplicate elemnts
        // List<Integer> numbers = Arrays.asList(1,2,3,4,5,3,2);

        // // Print the List:
        // System.out.println(numbers);
        // // Create a HashSet From the list 
        // Set<Integer> uniqueNumbers = new HashSet<>(numbers);

        // // print the HashSet:
        // System.out.println(uniqueNumbers);

        // HashSet<Integer> myHashSet = new HashSet<>(10);
        // // Add() --> used for adding new element in the hashsest.
        // myHashSet.add(1);
        // myHashSet.add(2);
        // myHashSet.add(3);
        // myHashSet.add(4);
        // myHashSet.add(1);
        // myHashSet.add(2);
        // myHashSet.add(11);
        // myHashSet.add(6);
        // myHashSet.add(0);

        // System.out.println(myHashSet);

        // //  Clear() --> Used for removes all the elements from this set
        // myHashSet.clear();
        // System.out.println(myHashSet);

         // Create a HashSet and add some elements
        //  HashSet<String> originalSet = new HashSet<>();
        //  originalSet.add("Apple");
        //  originalSet.add("Banana");
        //  originalSet.add("Cherry");
 
        //  // Clone the HashSet
        //  HashSet<String> clonedSet = (HashSet<String>) originalSet.clone();
 
        //  // Print both sets
        //  System.out.println("Original Set: " + originalSet);
        //  System.out.println("Cloned Set: " + clonedSet);

        // isEmpty() --> returns true if this set contsains no elements
        // System.out.println(myHashSet.isEmpty());

        // Create a hashset and add some elements:
        // Set<String> fruits = new HashSet<>();
        // fruits.add("Apple");
        // fruits.add("Banana");
        // fruits.add("Cherry");

        // // get an iterator for the HashSet:
        // Iterator<String> iterator = fruits.iterator();

        // // use the iterator to loop through each element:

        // System.out.println("Fruits in the set :");
        // while(iterator.hasNext()){
        //     String fruit = iterator.next();
        //     System.out.println(fruit);
        // }

    }
}