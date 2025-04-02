package Exception;

import java.util.Scanner;

public class new1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("scanner open");
        int arr[]={1,2,3};
        try {
            System.out.println(arr[5]);
        } catch (Exception naveen) {
            System.out.println("problem occerd!");
        }finally {
            System.out.println("scanner closed");
            sc.close();
        }
    }
}