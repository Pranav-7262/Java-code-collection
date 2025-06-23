package Queue;

import java.util.*;

public class InBuiltExample {
    public static void main(String[] args) {
        Queue<Integer>queue = new PriorityQueue<>();
        queue.add(57);
        queue.add(78);
        queue.add(34);
        queue.add(67);
        queue.add(69);
        System.out.println(queue);//FIFO
        queue.remove();//57 removed
        queue.remove();//78
        queue.remove();//34
        System.out.println(queue);
        System.out.println(queue.remove());//answer is 67

//        Deque<Integer>deque = new ArrayDeque<>();
//        deque.add(76);
//        deque.add(90);
//        deque.addFirst(89);
//        deque.addLast(100);
//        System.out.println(deque);
//        System.out.println(deque.getFirst());
//        System.out.println(deque.getLast());

    }
}
