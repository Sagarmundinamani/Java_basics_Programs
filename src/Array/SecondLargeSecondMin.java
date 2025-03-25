package Array;

import java.util.Scanner;

public class SecondLargeSecondMin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int min2=Integer.MAX_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        for(int i=0; i<n; i++){
            if(arr[i]>max2&& arr[i]!=max){
                max2=arr[i];

        }
            if(arr[i]<min2 && arr[i]!=min){
                min2=arr[i];
            }
        }
        System.out.println("max"+max);
        System.out.println("min"+min);
        System.out.println("2max"+max2);
        System.out.println("2min"+min2);

    }
}
