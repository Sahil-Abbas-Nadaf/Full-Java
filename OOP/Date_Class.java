import java.util.Date;
public class Date_Class{
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        System.out.println("Date:: "+d.getDate());
        System.out.println("Time:: "+d.getTime());
        System.out.println("Day:: "+d.getDay());
        System.out.println("Hours:: "+d.getHours());
        System.out.println("Minutes:: "+d.getMinutes());
        System.out.println("Seconds:: "+d.getSeconds());
        System.out.println("Month:: "+d.getMonth());
        System.out.println("Year:: "+d.getYear());
        System.out.println("TimezoneOffset:: "+d.getTimezoneOffset());
    }
}