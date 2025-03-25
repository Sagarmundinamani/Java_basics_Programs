package Array;

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num =sc.nextInt();
        int temp=num;
        int count = 0;
        int copyof=num;
        while (copyof > 0) {
            copyof /= 10;
            count++;
        }
        if(armstrong(temp,count)==temp){
            System.out.println(temp+" Armstrong number");
        }else{
            System.out.println(temp+" not Armstrong number" );
        }
    }

    public static int armstrong(int num, int count) {
        int sum =0;
        while (num > 0) {
            int ld = num % 10;
            sum+=power(ld,count);
            num /= 10;
        }
        return sum;
    }
    public static int power(int num,int expo){
        int sum2=1;
        for(int i=0; i<expo; i++){
            sum2*=num;
        }
        return sum2;
    }
}
