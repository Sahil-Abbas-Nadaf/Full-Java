import java.util.Scanner;

class SideOfTriangle
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Side :: ");
        int a = sc.nextInt();
        System.out.println("Enter Second Side :: ");
        int b = sc.nextInt();
        System.out.println("Enter Third Side :: ");
        int c = sc.nextInt();

        if( a+b>c && b+c>a && a+c>b)
        {
            System.out.println("Valid Triangle");
        }
        else
        {
            System.out.println("invalid triangle");
        }
    }
    }   