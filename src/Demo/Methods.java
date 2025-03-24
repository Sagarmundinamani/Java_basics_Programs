package Demo;

public class Methods {
    public static void main(String[] args) {
        int n1=10,n2=20;
       int  res=Addition(n1,n2);
        System.out.println(res);
        System.out.println(Addition(50,30));
    }
    public static int Addition(int n1,int n2){
        int sum=n1+n2;
        return sum;
    }
}
