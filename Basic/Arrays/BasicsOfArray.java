class BasicsOfArray{
public static void main(String[] args) {
    int arr[] = new int[5];
    /* arr[] is a reference       int marks[] is an array;
       new int [5] is object.     new int [5] it ia an memory allocation

    Format is datatype arrname[];

    better example of array is classroom of 500 students - you have to store marks of these 500 students
    you have two options 
    1. create 5oo variables 
    2. use array (recomended)
    */
    arr[0]=5;
    arr[1]=10;
    arr[2]=15;
    arr[3]=20;
    arr[4]=25;
    //arr[5]=35; Throws an error
    //How to print initialized data of array
    //System.out.println(arr[4]); 

/* 1.int []marks; -> declaration
      marks = new int[5];-> memory allocation

   2. int []marks = new int[5]; Declaration+ memory Allocation
   3. int marks[] = {100,98,95,81,80}; Declaration + initialization

    How to find length of array
  / System.out.println("Length of array is :: "+arr.length);

    we can create array in different datatypes
    for example
    int float[] ={100.5f,98.7f,95.0f,81.1f,80.5f};
    String students[] = {"Sahil","Arman","Sohel","Sholya Bahi"};
    System.out.println(students.length);
    System.out.println(students[3]); */
    // there is indexing And also elemnets present
    // for(int i = 0 ; i < arr.length ; i++)// that is array traversal
    // {
    //     System.out.println(arr[i]);
    // }

    // Displaying the Array (for-each loop) , this is modern way to printting elements of Array
    // but there is indexing is not present
    for(int element:arr){
        System.out.println(element);
    }
}
}