package NumberPrograms;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = 0;
        int temp = num;
        while (num > 0) {
            int ld = num % 10;
            rev = rev * 10 + ld;
            num /= 10;
        }
        if (temp == rev) {
            System.out.println("number is palindrome");
        }else {
            System.out.println("number is not palindrome");
        }
    }
}
