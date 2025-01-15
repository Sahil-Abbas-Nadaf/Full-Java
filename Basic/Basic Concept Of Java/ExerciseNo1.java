import java.util.Scanner;

class ExerciseNo1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks of Student:: ");
        float mark = sc.nextFloat();

        float percentage = (mark / 500)*100;
        System.out.println("Percentage of student is :: "+ percentage);

    }
}