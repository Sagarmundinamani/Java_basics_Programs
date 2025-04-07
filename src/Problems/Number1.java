package Problems;

import java.util.Scanner;

public class Number1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        if(num<0){
            System.out.println("not allowed negative number");
            return;
        }
        int count=0;
        String binary="";
        while(num>0) {
            int rem = num % 2;
            binary = rem + binary;
            num /= 2;
        }
        System.out.println(binary);
        for(int i=0; i<binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                count++;
            }
        }
        if(count%2==0){
            System.out.println("more likely win");
        }else{
            System.out.println("not sure");
        }

        }
    }
