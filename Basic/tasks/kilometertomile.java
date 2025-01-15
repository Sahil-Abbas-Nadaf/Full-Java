import java.util.Scanner;

class kilometertomile{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Kilometers:: ");
        int k = sc.nextInt();
        double KTM = k * (0.621371);
        System.out.println(" Miles :: " + KTM);
    }
}