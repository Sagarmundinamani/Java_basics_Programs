package Arrays;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={2,4,5,6,3};
        int min=arr[0];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j< arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }

            }
        }
        System.out.println("array is"+ Arrays.toString(arr));
    }
}
