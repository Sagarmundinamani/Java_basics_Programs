package Problems;

import java.util.Scanner;

public class StringHashStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int counts=0;
        int counth=0;
    for(int i=0; i<s.length(); i++){
        if(s.charAt(i)=='*'){
            counts++;
        }else{
            counth++;
        }
    }
        System.out.println(counts-counth);

    }

    }
