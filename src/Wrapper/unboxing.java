package Wrapper;

public class unboxing {
    public static void main(String[] args) {
        int a=25;
        Integer i=Integer.valueOf(a);//boxing
        System.out.println(i);
        Integer i2=a;//auto-boxing
        int a2=i.intValue();//unboxing
        System.out.println(a2);
        int a3=i;//auto-unboxing
    }
}
