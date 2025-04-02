package Exception;

public class demo2 {
    static void m1() throws InterruptedException{
        Thread.sleep(2000);
    }
    static  void m2() throws InterruptedException{
        m1();
    }
    static void m3()throws InterruptedException{
        m2();
    }
    public static void main(String[] args) throws InterruptedException{
        System.out.println("start");
        m3();
        System.out.println("end");
    }
}
