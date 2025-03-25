package Array;
import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int arr[]={2,5,3,6,8};
        System.out.println("Array before String");
        System.out.println("array is "+ Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Arrray  after the sort");
        System.out.println("array is "+ Arrays.toString(arr));
    }
}
