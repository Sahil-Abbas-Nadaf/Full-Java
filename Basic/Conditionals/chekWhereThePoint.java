import java.util.Scanner;

class chekWhereThePoint{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 1, y = 1, Rad = 5;
        System.out.println("Enter Points :: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        int oa = ((x-x1)*(x-x1)) + ((y-y1)*(y-y1));
        int r = Rad*Rad;

        if ( oa > r ){
            System.out.println("Point is Out of the circle.");
        }
        else if ( oa == r ){
            System.out.println("Point exaclty on the circle.");
        }
        else{
            System.out.println("Point is inside the circle.");
        }
        
    }
}