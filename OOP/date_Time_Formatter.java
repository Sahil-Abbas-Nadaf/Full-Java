import java.time.*;
import java.time.format.DateTimeFormatter;
public class date_Time_Formatter{
    public static void main(String[] args) {
      LocalDateTime dt = LocalDateTime.now(); // This is the date
      System.out.println(dt);

      DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy  E  H:m a");// This is the format
      String myDate = dt.format(df); // Creating date String using date and format
      System.out.println(myDate);
    }
}