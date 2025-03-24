package Arrays;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int temp=n;
        int sum2=0;
        while(n>0){
           int  ld=n%10;
            int z = FactorialNum(ld);
             sum2 +=z;
             n/=10;
        }

        if (temp == sum2) {
            System.out.println(temp+" is Strong number");
        } else {
            System.out.println(temp+" is not Strong number");
        }
    }
        public static int FactorialNum(int ld){
            int sum=1;
                for (int i = 1; i <=ld; i++) {
                  sum*=i;
                }
            return sum;

        }
    }

