class PassingIntAndArray{
    static void telljocks(){
        System.out.println("Hello, World!");
        System.out.println("Good Morning");
    }
    static void change(int x){
        x = 98;
    }

    static void change2(int arr[]){
        arr[0] = 98;
    }

    public static void main(String[] args) {
       // telljocks();
    // Case 1: changing the integer
    //    int x = 5;
    //    change(x);
    //    System.out.println("the value of x after running change is :: "+ x);

    //Case 2: changing the Array
       int marks[] = {52,73,77,89,98,94};
       change2(marks);
       System.out.println("the value of x after running change is :: "+ marks[0]);


    }
}