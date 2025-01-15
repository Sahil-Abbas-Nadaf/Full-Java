  HashSet<Integer> myHashSet = new HashSet<>(10);
        // Add() --> used for adding new element in the hashsest.
        myHashSet.add(1);
        myHashSet.add(2);
        myHashSet.add(3);
        myHashSet.add(4);
        myHashSet.add(1);
        myHashSet.add(2);
        myHashSet.add(11);
        myHashSet.add(6);
        myHashSet.add(0);

        System.out.println(myHashSet);

        //  Clear() --> Used for removes all the elements from this set
        myHashSet.clear();
        System.out.println(myHashSet);