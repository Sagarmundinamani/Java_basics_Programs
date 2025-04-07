package Multithreading;

public class Slider extends Thread{
    public void run(){
        for(int i=1; i<=10; i++){
            System.out.println("slide  "+i);
         try{
             Thread.sleep(5000);
         } catch (InterruptedException e) {
             System.out.println("some Problem occurred");
         }
        }
    }
}
