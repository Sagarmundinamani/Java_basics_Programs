package Patterns;

import java.util.Scanner;

public class Pattpyram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row number");
        int n = sc.nextInt();
        for (int i = 1; i <2*n; i++) {
            int stars = i <= n ? i : 2 * n - i;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}

