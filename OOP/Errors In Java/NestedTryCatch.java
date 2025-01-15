import java.util.Scanner;
public class NestedTryCatch{
    public static void main(String[] args) {
        int marks[] = new int[3];
        marks[0]=10;
        marks[1]=20;
        marks[2]=30;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index of array: ");
        int ind = sc.nextInt();
        try{
            System.out.println("Welcome to the java programming!");
            try{
                System.out.println(marks[ind]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Sorry, This index does not exists.");
                System.out.println("The Exception in level 2.");
                System.out.println(e);
            }
            System.out.println("Enter the number: ");
            int number = sc.nextInt();
            System.out.println("The value of array value/number is "+marks[ind]/number);
        }
        catch(Exception e){
            System.out.println("The Exception in level 1");
            System.out.println("The Arithmetic Exception occured, we Handle effectivly.");
        }
    }
}