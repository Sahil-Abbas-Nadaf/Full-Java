import java.util.Scanner;
class chekPointonWhichAxis{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X value:: ");
        float x = sc.nextFloat();
        System.out.println("Enter Y value:: ");
        float y = sc.nextFloat();

        if (x==0 && y==0){
            System.out.println("The Point lies on Origin.");
        }
        else if (x == 0){
            System.out.println("The point lies on X-axis.");
        }
        else if (y == 0){
            System.out.println("The point lies on Y-axis.");
        }
        else{
            System.out.println("The point lies between X and Y Axis.");
        }
    }
}