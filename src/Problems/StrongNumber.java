package Problems;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter password");
        int pass=sc.nextInt();
        int num=pass;
        int sum=0;
        while(pass>0){
            int ld=pass%10;
            sum=sum+Strong(ld);
            pass=pass/10;
        }
        if(num==sum){
            System.out.println(num+" is a strong password");
        }else{
            System.out.println(num+" is a not Strong password");
        }

    }
    public static int Strong(int ld){
        int sum=1;
        for(int i=ld; i>=1; i--){
            sum=sum*i;
        }
        return sum;
    }
}
