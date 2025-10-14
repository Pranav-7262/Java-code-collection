package SlidingWindow;
import java.util.*;

public class NegativeNumEachWindowK {
    public static void main(String[] args) {
       int [] arr = {-8, 2, 3, -6, 10};
        System.out.println(firstNegInt(arr , 2));
    }
    static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        List<Integer> list = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();
        int start = 0;

        for (int end = 0; end < arr.length; end++) {
            if (arr[end] < 0) {
                dq.add(arr[end]);
            }

            while (end - start + 1 > k) {
                if (!dq.isEmpty() && dq.peekFirst() == arr[start]) {
                    dq.removeFirst();
                }
                start++;
            }
            if (end - start + 1 == k) {
                if (!dq.isEmpty()) {
                    list.add(dq.peekFirst());
                } else {
                    list.add(0);
                }
            }
        }
        return list;
    }
}
