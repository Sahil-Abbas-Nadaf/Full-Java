import java.util.Scanner;
class result 
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Percentage:: ");
        int percentage = sc.nextInt();

        if(percentage>90 && percentage<100)
        {
            System.out.println("Excellent");
        }
        else if (percentage>80 && percentage<91)
        {
            System.out.println("Very Good");
        }
        else if (percentage>70 && percentage<81)
        {
            System.out.println("Good");
        }
        else if (percentage>60 && percentage<71)
        {
            System.out.println("Can Do Better");
        }
        else if (percentage>50 && percentage<61)
        {
            System.out.println("Average");
        }
        else if (percentage>40 && percentage<51)
        {
            System.out.println("Below Average");
        }
        else if(percentage>0 && percentage<41) {
            System.out.println("Fail");
        }
        else{
            System.out.println("Invalid Input.");
        }
    }
}