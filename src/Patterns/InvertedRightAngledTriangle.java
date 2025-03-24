package Patterns;

import java.util.Scanner;

public class InvertedRightAngledTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row number");
        int n = sc.nextInt();
        System.out.println("enter the column number");
        int m = sc.nextInt();
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
