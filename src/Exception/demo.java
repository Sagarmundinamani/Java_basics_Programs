package Exception;

public class demo {
    public static void main(String[] args) {
        int a=12, b=11;
        ArithmeticException a1=new ArithmeticException();
        if(a>b){
            throw a1;
        }else{
            throw new NullPointerException();
        }
    }
}