package Problems;

public class Alex {
    public static void main(String[] args) {
        int s=50,e=100;
        for(int i=s; i<100; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int number){
        int count=0;
        for(int i=1; i<=number; i++){
            if(number%i==0){
                count++;
            }
        }
        if (count == 2) {

            return true;
        }
        return false;
    }
}
