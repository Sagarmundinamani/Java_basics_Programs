package Collection;

import java.util.PriorityQueue;

public class PriorityQueuedemo {
    public static void main(String[] args) {
        PriorityQueue pq=new PriorityQueue();
        pq.offer(10);
        pq.offer(20);
        pq.add(30);
        pq.offer(40);
        System.out.println(pq);

    }
}
