package Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class BuiltInPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> que=new PriorityQueue<>();

        que.add(90);
        que.add(78);
        que.add(45);
        que.add(99);
        que.add(1);

   if (que.contains(1)){
       System.out.println("ok");
   }
        while (!que.isEmpty()){
            System.out.println(que.remove());
        }

    }
}
