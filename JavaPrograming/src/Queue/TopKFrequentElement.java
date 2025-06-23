package Queue;

import java.util.*;

public class TopKFrequentElement {
    public static void main(String[] args) {
  int []arr = {7, 10,11, 5, 2, 5, 5, 7, 11, 8, 9};
        System.out.println(Arrays.toString(topKFrequent(arr,4)));
    }
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>hm = new HashMap<>();
        for (int num:nums){
            hm.put(num, hm.getOrDefault(num,0)+1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap;
        minHeap = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));
        for (Map.Entry<Integer,Integer>entry:hm.entrySet()){
            minHeap.add(entry);
            if (minHeap.size()>k){
                minHeap.poll();
            }
        }
        int []arr = new int[k];
        int i = 0;
        while (!minHeap.isEmpty()){
            arr[i++] = minHeap.poll().getKey();
        }
        return arr;
    }
}
