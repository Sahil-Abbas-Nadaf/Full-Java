import java.util.Scanner;

class Array{
   private int []arr;
   private int size;
    public void setArray(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Size of Array :: ");
        this.size = s.nextInt();
        this.arr = new int[size];
        System.out.print("\nEnter Array Elements:: ");
        for(int i = 0; i<size; i++){
         this.arr[i] = s.nextInt();
        }

    }

    public void getArray(){
        System.out.print("\nThe Entered Array Elements are:: ");
        for(int e : this.arr){
            System.out.print(e+" ");
        }
    }
}

public class SettingArray {
    public static void main(String[] args) {
        Array a = new Array();
        a.setArray();
        a.getArray();
    }
}