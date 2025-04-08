package Problems;

import java.util.Scanner;

public class StringRemove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String c[] = s.split(",");
        String a = c[0];
        String b = c[1];
        string1(a, b);
    }

    public static void string1(String a, String b) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (b.indexOf(ch) == -1) {
                result.append(ch);
            }
        }
        System.out.println(result);
    }
}
