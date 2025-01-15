public class Hashing{
    public static void main(String[] args) {
        // Hashing is a technique which convert key-value pair to indixes
         0   1  2  3  4  5  6  7  8  9
        |  |  |  |  |  |  |  |  |  |  | // -> this is an Array

          X           F(x)            for Hashing we use Hash Function
            72            2             Hash function is basicaly a mathematical logical 
            39            9             block for arranging the elements in specific manner
            11            1             
            18            8              here we write hash function as
            21            1                 f(x) =  X % 10   10 for size of array
            92            2
          
        This is the simple hasing method:
         0    1    2    3  4  5  6  7   8    9
        |  | 11 | 72  |  |  |  |  |  | 18  | 39 | --> Hash table

        one method is : Open Addressing To Handle Collision 
         0    1    2    3   4  5  6  7   8    9
        |  | 11 | 72  | 21 |  |  |  |  | 18  | 39 |

        Another method is : Chaning 
         0    1    2    3   4  5  6  7   8    9
        |  | 11 | 72  | 21 |  |  |  |  | 18  | 39 |
                   |
               |72 | 92|

    Whenever the hash table is going to full then we just need to increase the size of the hash table
    and copy all the elements present from the previous hash table and resize in correct time.

    Loading Factor : LF is a measure of how full the hash table is allowed to get before its copacity automaticaly increased
     
    Collections :
        1> Hashset 
        2> HashMap
        3> Linked HashMap
        4> Hash Table

    }
}