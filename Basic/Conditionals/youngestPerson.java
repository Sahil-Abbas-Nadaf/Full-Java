import java.util.Scanner;
class youngestPerson
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Ram's Age :: ");
        int rAge = sc.nextInt();

        System.out.println("Enter Shyam's Age :: ");
        int sAge = sc.nextInt();

        System.out.println("Enter Ajay's Age :: ");
        int aAge = sc.nextInt();

        if(rAge < sAge && rAge < aAge)
        {
            System.out.println("Ram is the Youngest Person");
        }
        else if(sAge < rAge && sAge < aAge)
        {
            System.out.println("Shyam is the Youngest Person");
        }
        else if (aAge < rAge && aAge < sAge){
            System.out.println("Ajay is the Youngest Person");
        }
        else{
            System.out.println("The age of Ram, Shyam, Ajay are equal.");
        }

    }
}