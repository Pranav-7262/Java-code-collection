package Queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        pq.add(99);
        pq.add(67);
        pq.offer(44);
        pq.add(69);
        System.out.println(pq);
//        System.out.println(pq.poll());
        System.out.println("Peek is:"+pq.peek());
        while (!pq.isEmpty()){
            System.out.println(pq.poll());
        }



    }
}
