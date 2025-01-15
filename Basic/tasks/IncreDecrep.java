import java.util.Scanner;

class IncreDecrep
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // Increpted
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);   
    
    // Decrepted
        grade = (char)(grade - 8);
        System.out.println(grade); 
}
}