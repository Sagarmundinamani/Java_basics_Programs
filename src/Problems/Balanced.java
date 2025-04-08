package Problems;

import java.util.Scanner;

public class Balanced {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        int sum2=0;
        int sum1=0;
        int ld=num%10;
            sum1=ld;
            num/=10;

        while(num>10){
            int rem=num%10;
            sum2+=rem;
            num/=10;
        }
        System.out.println(sum2);
        sum1+=num;
        System.out.println(sum1);
        if(sum1==sum2){
            System.out.println("balanced");
        }else{
            System.out.println("not balanced");
        }
    }//balanced -xylem no else phloem no
}
