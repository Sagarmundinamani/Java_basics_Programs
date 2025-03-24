package Arrays;
import java.util.Scanner;

public class FindMaxMin {
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
        for(int i=0; i<n; i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("the max number is"+max);
        System.out.println("the min number is"+min);
    }
}
