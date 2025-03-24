package Demo;
import java.util.Scanner;

public class Switchnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        switch(num){
            case 10:
                System.out.println("number matched");
                break;
            case 20:
                System.out.println("number 20 matched");
                break;
            default:
                System.out.println("number not found");

        }
    }
}
