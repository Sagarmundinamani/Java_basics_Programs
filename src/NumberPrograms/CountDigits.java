package NumberPrograms;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int number=sc.nextInt();
        int count=0;
        if(number==0){
            count++;
        }
        while(number>0) {
            number /= 10;
            count++;
        }

        System.out.println("number of the digits are  "+count);
    }
}
