package Arrays;

import java.util.Scanner;

public class New1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        if(isprime(n)==1){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }
    public static int isprime(int n){
        int count=0;
        if(n<=1){
            count=0;
        }
     for(int i=1; i<=Math.sqrt(n); i++){
         if(n%i==0){
             count++;
         }
     }
     return count;
    }
}
