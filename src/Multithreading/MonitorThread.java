package Multithreading;

public class MonitorThread extends Thread{
    HackerThread hackerThread;
    int timeLimit;
    MonitorThread(HackerThread hackerThread, int timeLimit) {
        this.hackerThread = hackerThread;
        this.timeLimit = timeLimit;
    }
    public void run(){
        long startTime=System.currentTimeMillis();
        try {
            hackerThread.join(timeLimit);
            long timeTaken = System.currentTimeMillis()-startTime;
            if (hackerThread.isCracked()) {
                System.out.println("Time Taken:" + timeTaken + "ms");
            }
            if (!hackerThread.isCracked()) {
                System.out.println("Time limit reached.. stopping hacker thread!");
                hackerThread.interrupt();
                System.out.println("time Taken: " + timeTaken + "ms");
            }
        }catch (Exception e){
            System.out.println("Some error occurred");
        }
    }
}
