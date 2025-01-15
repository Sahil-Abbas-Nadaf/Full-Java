public class ArrayAsReturnValue{

    public static void printArray(int[] array){
        for(int e: array){
            System.out.print(e+" ");
        }
    }
    public static int[] reverse(int[] list){
        int result[] = new int[list.length];
        int size = result.length;
        for(int i=0,j=size-1; i<size && j>=0; i++,j--){
            result[j] = list[i];
        }
        return result;
    }
    public static void main(String[] args) {
        printArray(reverse(new int[]{3,1,2,6,4,2}));
    }
}