package Patterns;

import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row number");
        int n=sc.nextInt();
        System.out.println("enter the column number");
        int m= sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }
}
