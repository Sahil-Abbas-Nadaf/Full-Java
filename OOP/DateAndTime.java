public class DateAndTime{
    public static void main(String[] args) {
        System.out.println("Minutes :: "+System.currentTimeMillis()/1000/60);
        System.out.println("Hours   :: "+System.currentTimeMillis()/1000/3600);
        System.out.println("days    :: "+System.currentTimeMillis()/1000/3600/24);
        System.out.println("Weeks   :: "+System.currentTimeMillis()/1000/3600/24/7);
        System.out.println("Months  :: "+System.currentTimeMillis()/1000/3600/24/30);
        System.out.println("Years   :: "+System.currentTimeMillis()/1000/3600/24/365);

        // it is ok when we store the number of milliseconds
        System.out.println("The maximun value of Long :: "+Long.MAX_VALUE);
        long years = System.currentTimeMillis();
        System.out.println("Yes, we can able to store the value of milliseconds in long Datatype!");
        System.out.println("Upto todays milliseconds are  "+years);
    }
}