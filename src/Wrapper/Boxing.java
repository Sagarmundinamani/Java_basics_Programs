package Wrapper;

public class Boxing {
    public static void main(String[] args) {
        int a=25;
        Integer i=Integer.valueOf(a);//boxing
        System.out.println(i);
        int b=30;
        Integer i2=b;//autoboxing
        System.out.println(i2);
    }
}
