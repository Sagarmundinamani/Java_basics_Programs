package Problems;

import java.util.Scanner;

public class Gcdfind {
    public static int gcdNumber(int n1,int n2){
        int gcd=1;
        for(int i=1; i<=Math.min(n1, n2); i++){
            if(n1%i==0 && n2%i==0){
                gcd=i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int n1= sc.nextInt();
        System.out.println("enter the second number");
        int n2= sc.nextInt();
        int m=gcdNumber(n1,n2);
        System.out.println("the gcd of the number "+m);
    }
}
