package Multithreading;

public class Thread2 implements Runnable {
        public void run(){
            for(int i=5; i>=1; i--){
                System.out.println(i);
            }
        }
    }
