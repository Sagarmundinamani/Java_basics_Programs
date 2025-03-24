package Arrays;
import java.util.*;

import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value");
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i< n; i++){
            arr[i]=sc.nextInt();

        }
        Arrays.sort(arr);
        System.out.println("the array is");
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
