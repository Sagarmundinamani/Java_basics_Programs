package Array;

public class Factors {
    public static void main(String[] args) {
        int num=20;
        int s=1,n=20;
        for(int i=s; i<=n; i++){
            if(num%i==0){
                System.out.println(i);
            }

        }
    }
}
