package NumberPrograms;

import java.util.Scanner;

public class UppercaseLowercase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(ch>='A' && ch<='Z'){
            System.out.println(ch+" Upper Case");
        } else if (ch>='a'&&ch<='z'){
            System.out.println(ch+" Lower Case");
        } else if(ch>='0' && ch<='9'){
            System.out.println(ch+" Number");
        }else{
            System.out.println(ch+" Special Charcter");
        }
    }
}
