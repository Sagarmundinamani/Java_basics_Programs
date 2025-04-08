package Problems;

import java.util.Scanner;

public class Monday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the starting day of week for mon 1,tue 2...");
        int startday = sc.nextInt()-1;
        System.out.println("total number of the days in month");
        int totaldays = sc.nextInt();
        int numOfMondays = countMondays(startday, totaldays);
        System.out.println("number of the mondays" + numOfMondays);
    }

    public static int countMondays(int s, int t) {
        int count = 0;
        for (int i = 1; i <= t; i++) {
            if ((s + i - 1) % 7 == 0) {
                count++;
            }
        }
        return count;
    }
}
