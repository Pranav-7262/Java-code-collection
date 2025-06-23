package Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PQnew {
    public static void main(String[] args) {
        PriorityQueue <String> pq = new PriorityQueue<>();
        pq.add("A");
        pq.add("B");
        pq.add("C");
        System.out.println("head :"+pq.element());
        System.out.println("peek : "+pq.peek());
        Iterator iterator = pq.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        pq.remove();
//        pq.poll();
        System.out.println("after removing : ");
        Iterator<String> iterator1 = pq.iterator();
        while (iterator1.hasNext())
            System.out.println(iterator1.next());
    }
}
