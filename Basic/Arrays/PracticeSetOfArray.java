import java.util.Scanner;
class PracticeSetOfArray{
    public static void main(String[] args) {
        // Problem 1:
        // Create an array of 5 flots and calculate their sum
        // float arr[]=new float[5];
        // Scanner s = new Scanner(System.in);
        // System.out.print("Enter 5 Float Numbers:: ");
        // for(int i = 0; i<arr.length; i++){
        //     arr[i] = s.nextFloat();
        // }
        // float sum =0;
        // // for(int i = 0; i<arr.length; i++){
        // //     sum += arr[i];
        // // }
        // System.out.print("Entered Number is:: ");
        // for(float numbers : arr){
        //     System.out.print(numbers);
        //     System.out.print(" ");
        // }
        // for(float element : arr){
        //     sum += element;
        // }
        // System.out.println("\nThe Sum is :: " +sum);
        

    //Proble 2:
    //Write a Program to find out wheather a given integer present in array or not.
    /*int arr[] = {10,20,30,40,50,60,70,80,90,100};
    int check;
    System.out.println("Enter a Integer Number:: ");
    Scanner s = new Scanner(System.in);
    check = s.nextInt();
    int i=0;
    for(int element: arr){
        if (check == element){
            System.out.println("The Number is Found..!");
            break;
        }
        else if(i == (arr.length-1)){
            System.out.println("Numbert is not found...!");
        }
        i++;*/

       // ather way to solve this same problem
    /*int arr[] = {10,20,30,40,50,60,70,80,90,100};
    System.out.println("Enter a Integer Number:: ");
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    boolean isInArray = false;
    for(int element: arr){
        if (num == element){
            isInArray = true;
            break;
        }
    }

    if(isInArray){
        System.out.println("The Number is Present in Array..!");
    }
    else{
        System.out.println("The Number is not Present in Array..!");
    } */
   // Problem 3:
   // find the average of given valaue providede by the user.
     /*   float arr[]=new float[5];
        Scanner s = new Scanner(System.in);
        System.out.print("Enter 5 Float Numbers:: ");
        for(int i = 0; i<arr.length; i++){
            arr[i] = s.nextFloat();
        }
        float sum =0;
        for(float element : arr){
            sum += element;
        }
        System.out.println("\nThe value of Average is :: " +(sum/arr.length));*/

      //Practice Problem 4:
      //create a java program to add two matrices of size 2X3
      /*  int arr1[][] ={{1,2,3},
                       {4,5,6}};
        int arr2[][] ={{4,5,6},
                       {1,2,3}};
        int result[][] = {{0,0,0},
                          {0,0,0}};
        for(int i=0; i<arr1.length; i++){// row number of times
            for(int j =0; j<arr1[i].length; j++){ //column number of times
                System.out.format("Setting value for i = %d And j = %d \n",i,j);
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
            System.out.println("\nThe Resultant Matrics is :: ");
        for(int i=0; i<result.length; i++){// row number of times
            for(int j =0; j<result[i].length; j++){ //column number of times
                System.out.print(result[i][j] + " ");
            }
            System.out.println("");
        }

        Problem 5:
        char arr[] = {'U','B','F','D','A','E','C'};
        int arr[] = {1,2,3,4,5,6};
        one method
        for(int i = arr.length-1 ;i>=0; i--){
            System.out.print(arr[i]+ " ");
        }

        // Second method
        int l = arr.length;
        int n = Math.floorDiv(l,2);
        //char temp;
        int temp;
        for(int i=0; i<n ; i++){
            // swap a[i] and a[l-1-i]
            //  a   b   temp
            // [3] [4]  [ ]
            // [4] [4]  [3]
            // [4] [3]  [3]
            temp = arr[i];
            arr[i] = arr[l-1-i];
            arr[l-1-i] = temp;
        }

        // for(char element : arr){
        //     System.out.print(element +" ");
        // }
        for(int element : arr){
            System.out.print(element +" ");
        }*/

        // Problem number 6:
        // Find maximum number in array
        // int arr[] = {1,2,3,4,5,6};
        // int max =Integer.MIN_VALUE;
        // for(int i=0 ; i<arr.length ; i++){
        //     if (max <= arr[i]){
        //         max = arr[i];
        //     }
        // }
        // System.out.println("The Max Value in given array is:: "+max);

        // Problem number 7:
        // Find min number in given array
        // int arr[] = {1,2,3,4,5,6};
        // int min = Integer.MAX_VALUE;
        // for(int i=0 ; i<arr.length ; i++){
        //     if (min > arr[i]){
        //         min = arr[i];
        //     }
        // }
        // System.out.println("The Min Value in given array is:: "+min);

        //In java what is max and min value of integer
        // System.out.println(Integer.MAX_VALUE);
        // System.out.println(Integer.MIN_VALUE);

        int arr[] = {1,2100,3,455,5,43,67};
        boolean isSorted = true;
        for(int i=0 ; i<arr.length-1 ; i++){
            if(arr[i] >= arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted)  System.out.println("Array is Sorted..!");
        else          System.out.println("Array is Not Sorted..!");  
        

    }
}