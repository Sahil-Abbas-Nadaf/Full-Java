import java.util.ArrayDeque;
public class ArrayDequeue{
    public static void main(String[] args) {
        ArrayDeque<Integer> aq = new ArrayDeque<>();

        // Add method --> Adding the element at the end 
        aq.add(2);
        aq.add(3);
        System.out.println(aq);

        // When you need to add the element at the first then you use method that is :
        // addFirst();
        aq.addFirst(1);
        aq.addFirst(0);
        System.out.println(aq);

        // for Printting First element or getting first element: use getFirst()
        System.out.println(aq.getFirst());

         // for Printting last element or getting last element: use getLast()
         System.out.println(aq.getLast());


    }
}