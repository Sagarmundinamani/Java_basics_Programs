package Array;

public class Perfect {
    public static void main(String[] args) {
        int num = 28;
        int s = 1, n = 28;
        int sum = 0;
        for (int i = s; i < n; i++) {
            if (num % i == 0) {
                System.out.println(i);
                sum += i;
            }
        }
        if(num==sum){
            System.out.println("perfect number");
        }else {
            System.out.println("not perfect number");
        }
    }
}