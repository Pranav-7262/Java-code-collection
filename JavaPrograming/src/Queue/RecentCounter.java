package Queue;

import java.util.LinkedList;
import java.util.Queue;

 public class RecentCounter {
     Queue<Integer> queue;
    public RecentCounter() {
        queue = new LinkedList();
    }

    public int ping(int t) {
        queue.add(t);
        while (queue.peek() < t - 3000) {
            queue.poll();
        }
        return queue.size();
    }
}
