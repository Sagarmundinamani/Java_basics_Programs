package Array;

import java.util.Scanner;

public class New2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(expo(num,n));
    }
    public static int expo(int num,int n ){
        int sum=1;
        for(int i=1; i<=n; i++){
           sum*=num;
        }
        return sum;
    }
}
