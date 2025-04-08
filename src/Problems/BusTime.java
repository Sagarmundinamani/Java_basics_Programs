package Problems;

import java.util.Scanner;

public class BusTime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the bus a");
        int ba= sc.nextInt();
        System.out.println("enter the bus b");
        int bb= sc.nextInt();
        int time=sameTime(ba,bb);
        System.out.println("next time bus a and bus b meet at "+time+" minutes");
    }
    public static int sameTime(int n1,int n2){
        int gcd=1;
        for(int i=1; i<=Math.min(n1,n2); i++){
                if(n1%i==0 && n2%i==0){
                    gcd=i;
                }
            }
        int value=(n1*n2)/gcd;
           return value;
        }
    }

