package NumberPrograms;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner rcb=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num= rcb.nextInt();
        System.out.println("enter the second number");
        int num2=rcb.nextInt();
        int sum=num+num2;
        System.out.println("sum of the two number="+sum);
    }
}
