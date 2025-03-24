package Demo;
import java.util.Scanner;

import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter operator +,_,*,/:");
        char s =sc.next().charAt(0);
        int a=10,b=20;
        int sum=0;
        switch (s){
            case '+':
                sum=a+b;
                System.out.println(sum+"");
                break;
            case '-':
                sum =a-b;
                System.out.println(sum+"");
                break;
            case '/':
                sum =a/b;
                System.out.println(sum+"");
                break;
            case '*':
                sum=a*b;
                System.out.println(sum+"");
                break;

            default:
                System.out.println("invalid operator");
        }
    }
}

