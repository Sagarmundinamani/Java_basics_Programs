package Multithreading;

public class Hacker {
    public static void main(String[] args) {
        Bank b=new Bank();
        HackerThread ht=new HackerThread(b.pass);
        MonitorThread mt=new MonitorThread(ht,5000);
        ht.start();
        mt.start();
    }
}
