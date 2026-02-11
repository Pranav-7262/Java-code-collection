package Queue;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestInStream {
    public static void main(String[] args) {
         int [] arr= {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(kthLargest(4,arr,6)));
    }
    static int[] kthLargest(int k, int[] arr, int n) {
        // code here
        int i=0;
        int []ans = new int[n];
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int num : arr) {
            pq.add(num);
            if(pq.size() > k) {
                pq.poll();
            }
            if(pq.size() < k) {
                ans[i++] = -1;
            } else {
                ans[i++] = pq.peek();
            }
        }
        return ans;
    }
}
