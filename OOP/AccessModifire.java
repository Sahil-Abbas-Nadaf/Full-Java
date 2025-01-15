class c1{
    public int x = 5;
    protected int y = 10;
    int z = 56;
    private int a = 34;

    // This is method test
    public void test(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
public class AccessModifire{
    public static void main(String[] args) {
        c1 c = new c1();
        // this case for classes
        // c.test();  check for class

        //this case for packages
        // System.out.println(c.x);
        // System.out.println(c.y);
        // System.out.println(c.z);
        //System.out.println(c.a);  thros an erro because it is private, 
        //it can't accessible from one package to another packages

        // subclass ka matlab hai ki jab main ek alag package tayar
        // karta hun aur usme mai me ek class create karata hun c1 ko
        // inheriat karata hun
        // jaise ki ex =  class c2 extendse c1{}  in that case we can 
        // only access public and protected

        // world ka meaning hai aap class package aur subclass se alag 
        // jagah ho aur aap koi chees access karana chahate ho
        // for example aapne alag hi file create kar di and then aap access karna chahate hai
        // to only public methods aur properties you can able to access

    }
}

/* Modifiers    class      package     subcalss     world
   Public        Y            Y            Y          Y
   Protected     Y            Y            Y          N
   Difault       Y            Y            N          N
   Private       Y            N            N          N        */ 