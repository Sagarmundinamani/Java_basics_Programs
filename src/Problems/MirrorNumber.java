package Problems;

import java.util.Scanner;

public class MirrorNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Starting number");
        int start = sc.nextInt();
        System.out.println("ending number");
        int end = sc.nextInt();
        for (int i = start; i <= end; i++) {
            if (isPalindrome(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean isPalindrome(int num) {
        int n = num;
        int rev = 0;
        while (num > 0) {
            int ld = num % 10;
            rev = rev * 10 + ld;
            num /= 10;
        }
        if (n==rev) {
            return true;
        }
        return false;
    }
}
