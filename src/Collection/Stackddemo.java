package Collection;

import java.util.Stack;

public class Stackddemo {
    public static void main(String[] args) {
        Stack s1=new Stack();
        s1.add(10);
        s1.add(20);
        s1.push(18);
        s1.push(22);
        s1.push(30);
        System.out.println(s1);
        s1.pop();
        System.out.println(s1);
        System.out.println(s1.peek());
        System.out.println(s1.empty());
        System.out.println(s1.search(18));
    }
}
