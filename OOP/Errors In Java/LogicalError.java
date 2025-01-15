public class LogicalError{
    public static void main(String[] args) {
        //LOGICAL ERROR DEMO
        // write a program to print all prime numbers between 1 to 10
        //  2,3,5,7,......n  all are prime numbers
        System.out.println(2);
        for(int i=0; i<5; i++){  // this code gives you wrong ans so this error is called logical error.
            System.out.println(2*i+1);
        }
        // logical error ka matlab yah hai ki ye error devloper ke taraf se hota hai 
        // for example : main chahata hu ki even number ka code aur vo code odd number ke liye likha hoga to IDE help
        // nahi kar sakata ek vakat syntax error ko IDE help kar sakta hai. to ye developer ko jaana na chahiye ki use kiske liye code likhana chahiye.

    }
}