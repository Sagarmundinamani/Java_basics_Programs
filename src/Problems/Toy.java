package Problems;

import java.util.Scanner;

public class Toy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter Block number positive");
        int b=sc.nextInt();
        if(b<0){
            System.out.println("negative number not allowed");
            return;
        }
        if(sumOfNumber(b)==sumOfMul(b)) {
            System.out.println("pass");
        }else{
            System.out.println("rejected");

        }
    }
    public static int sumOfNumber(int number){
        int sum=0;
        if(number>0){
            int ld=number%10;
            sum+=ld;
            number/=10;
        }
        return sum;
    }
    public static int sumOfMul(int number){
        int mul=1;
        if(number>0){
            int ld=number%10;
            mul*=ld;
            number/=10;
        }
        return mul;
    }
}
