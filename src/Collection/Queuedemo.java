package Collection;

import java.util.LinkedList;
import java.util.Queue;

public class Queuedemo {
    public static void main(String[] args) {
        Queue q=new LinkedList();
        q.add(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        System.out.println(q);
        q.poll();
        System.out.println(q);
        q.remove();
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.element());

        Queue q1=new LinkedList();
        System.out.println(q1.poll());
        System.out.println(q1.peek());
        System.out.println(q1.element());//not give value show error
        System.out.println();
    }
}
