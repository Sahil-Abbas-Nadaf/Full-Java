import java.util.*;

class MyGeneric<T1,T2>{
    int val;
    private T1 t1;
    private T2 t2;

    public MyGeneric(int val, T1 t1,T2 t2){
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }

    public int getVal(){
        return this.val;
    }

    public void setVal(int val){
        this.val = val;
    }
    public T1 getT1(){
        return this.t1;
    }

    public void setT1(T1 t1){
        this.t1 = t1;
    }

    public T2 getT2(){
        return this.t2;
    }

    public void setT2(T2 t2){
        this.t2 = t2;
    }
}

public class Generics{
    public static void main(String[] args) {
        //  In this array list we can add object not any type of data type 
        // ArrayList arrayList = new ArrayList();
        // arrayList.add("Start");
        // arrayList.add(16);
        // arrayList.add(45);
        // arrayList.add(new Scanner(System.in));

        // int n = (int) arrayList.get(2);  
        // //  String n = (int) arrayList.get(2)+"";  --> This line convert the integer into String datatype
        // System.out.println(n);

        //  if we can want to make Integer ArraList or other type of datatype of arraylist then you need to specify that datatype
        // ArrayList<int> list = new ArrayList<>(); --> this will produce an error
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // System.out.println(list);

        MyGeneric<String,Integer> gn = new MyGeneric(66,"Sahil Abbas Nadaf",99);
         int a =  gn.getVal();
         System.out.println("Value = "+a);
        String str = gn.getT1();
        System.out.println("String = "+str);
        int b =  gn.getT2();
        System.out.println("Value = "+b);
    }
}