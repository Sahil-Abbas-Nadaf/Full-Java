class basicsofmethods{
    static int logic(int x, int y){
        int z;
        z = x + y;
        return z;
    }
    int difference(int x1, int y1){
        int z1;
        z1 = x1 - y1;
        return z1;
    }
    public static void main(String[] args) {
        // when you are creatig any method the you have two options
        // 1.create with static ,then u not need to create object.
        // 2.create with no static, then u need to create object.
        
        // it has commn copy means ek hostel me sab me ek hi freez hai.
        int a = 5;
        int b = 7;
        int c = logic(a,b);
        System.out.println("Sum is :: "+c);

        // method calling through objects
        // each object has separate copy means ek hostel me sab ke pas freez hai.
        basicsofmethods obj = new basicsofmethods();
        int a1 = 5;
        int b1 = 7;
        int c1 = obj.difference(a1,b1);
        System.out.println("Sum is :: "+c1);
    }
}