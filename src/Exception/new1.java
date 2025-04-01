package Exception;

public class new1 {
    public static void main(String[] args) {
        System.out.println("start");
        int a = 10, b = 10;
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e1) {
            System.out.println("problem occerd!");
        }
        System.out.println("end");
    }
}