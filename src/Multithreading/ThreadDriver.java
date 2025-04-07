package Multithreading;

public class ThreadDriver {
    public static void main(String[] args) {
        Thread1 t1=new Thread1();
        System.out.println("Main Thread");
        t1.start();
        Thread2 t2=new Thread2();
        Thread t=new Thread(t2);
        System.out.println("threading");
        t.start();
    }
}
