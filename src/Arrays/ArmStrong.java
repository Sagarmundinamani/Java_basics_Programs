package Arrays;

import java.sql.SQLOutput;

public class ArmStrong {
    public static void main(String[] args) {
        int num = 153;
        int temp=num;
        int count = 0;
        int copyof=num;
        while (copyof > 0) {
            copyof /= 10;
            count++;
        }
        if(armstrong(temp,count)==temp){
            System.out.println("Armstrong");
        }else{
            System.out.println("not Armstrong" );
        }
    }

    public static int armstrong(int num, int count) {
        int sum =0;
        while (num > 0) {
            int ld = num % 10;
            sum+=power(ld,count);
            num /= 10;
        }
        return sum;
    }
    public static int power(int num,int expo){
        int sum2=1;
        for(int i=0; i<expo; i++){
            sum2*=num;
        }
        return sum2;
    }
}
