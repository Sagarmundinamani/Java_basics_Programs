package Multithreading;

public class HackerThread extends Thread{
    int pass;
    boolean cracked=false;
    public HackerThread(int pass){this.pass=pass;}
    public boolean isCracked(){return cracked;}
    public void run(){
        for(int i=0; i<=9999; i++){
            if(cracked) {
                break;
            }
            if(i==pass){
                System.out.println("Password found,the Password is "+i);
                cracked=true;
                break;
            }
        }
        if(!cracked){
            System.out.println("Hacker thread is not able to find password");
        }
    }
}
