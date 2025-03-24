package NumberPrograms;

public class Sumofevenodd {
    public static void main(String[] args) {
        int sumeven=0;
        int sumodd=0;
        int s=1,n=10;
        for(int i=s; i<=n; i++){
            if (i % 2 == 0) {
                sumeven+=i;

            }else{
                sumodd+=i;
            }
        }
        System.out.println(sumeven);
        System.out.println(sumodd);
    }
}
