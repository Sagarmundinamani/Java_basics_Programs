package Patterns;

import java.util.Scanner;

public class Diamond2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row number");
        int n = sc.nextInt();
        for(int i=1; i<=2*n-1; i++){
            for(int j=1; j<=2*n-1; j++){
                if(i+j>=n+1 && j-i<=n-1&&i-j<=n-1&&i+j<=3*n-1){
                    System.out.print("*"+" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
