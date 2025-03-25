package Patterns;

import java.util.Scanner;

public class Pyramid2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row number");
        int n = sc.nextInt();
       for(int i=1; i<=n; i++){
           for(int j=1; j<=2*n-1; j++){
               if(j>=i && i+j<=2*n){
                   System.out.print("*"+" ");
               }else{
                   System.out.print("  ");
               }
           }
           System.out.println();
       }
    }
}
