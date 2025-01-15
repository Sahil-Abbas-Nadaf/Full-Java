public class EvenArray{
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        int b[] = new int[a.length/2];
        int k = 0;
        
        for(int i = 0 ; i<10 ; i++){

            if(a[i]%2==0){
                b[k] = a[i];
                k++;
            }
        }
        System.out.print("The First Array is : ");
        for(int i = 0; i<10; i++){
            System.out.print(a[i]+" ");
        }
        System.out.print("\nThe Even  Array is : ");
        for(int i = 0; i<b.length; i++){
            System.out.print(b[i]+" ");
        }
    }
}