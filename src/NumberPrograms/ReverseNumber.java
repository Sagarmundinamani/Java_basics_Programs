package NumberPrograms;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        int rev=0;
        while(num>0){
            int ld=num%10;
            rev=rev*10+ld;
            num/=10;
        }
        System.out.println("the rev number is "+rev);
    }
}
