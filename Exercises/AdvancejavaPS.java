import java.util.ArrayList;
import java.util.HashSet;
import java.util.Date;
import java.util.Calendar;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class AdvancejavaPS{
    public static void main(String[] args) {
        //PS 01 :
        ArrayList ar = new ArrayList();
        ar.add("Student 1");
        ar.add("Student 2");
        ar.add("Student 3");
        ar.add("Student 4");
        ar.add("Student 5");
        ar.add("Student 6");
        ar.add("Student 7");
        ar.add("Student 8");
        ar.add("Student 9");
        ar.add("Student 10");
        for(Object o: ar){
            System.out.println(o);
        }
        // System.out.println(ar);

        // PS Q2: print Date And time
        Date d = new Date();
        System.out.println("\nTime Using Util Packagem in Date :: "+d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());

        //PS Q3:
        Calendar c = Calendar.getInstance();
        System.out.println("Time Using Calendar :: "+c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND)+":");
        System.out.println("Time Using Calendar :: "+c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND)+":");

        //PS Q4:
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);        
        
        DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s");
        String myTime = dt.format(df);
        System.out.println(myTime);
        // PS Q5:
        HashSet<Integer> s = new HashSet<>();
        s.add(5);
        s.add(6);
        s.add(46);
        s.add(60);
        s.add(9);
        s.add(6);
        System.out.println("\n"+s);
    }
}