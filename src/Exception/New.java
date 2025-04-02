package Exception;

public class New {
    public static void main(String[] args) {

            int a=10,b=0;
            int res=a/b;
        System.out.println(res);//ArithmeticException
             String s1=null;
        System.out.println(s1.length());//NullPointerException
        int arr[]={1,3,2};
        System.out.println(arr[5]);//ArrayIndexOutOfBoundsException
    }
}
