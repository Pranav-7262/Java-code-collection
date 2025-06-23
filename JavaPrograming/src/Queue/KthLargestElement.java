package Queue;

import java.util.PriorityQueue;

public class KthLargestElement {
    public static void main(String[] args) {
   int []arr = {2,3,4,5,6,7,8};
        System.out.println(findKthLargest(arr, 2));
    }
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>minheap = new PriorityQueue<>();
        for (int num:nums){
            minheap.add(num);
            if (minheap.size()>k){
                minheap.poll();
            }
        }
        return minheap.peek();
    }
}
