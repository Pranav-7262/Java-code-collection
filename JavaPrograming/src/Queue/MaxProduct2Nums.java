package Queue;

import java.util.PriorityQueue;

public class MaxProduct2Nums {
    public static void main(String[] args) {
       int [] arr = {3,4,5,2};
        System.out.println(maxProduct(arr));
   }
        public static int maxProduct ( int[] arr){
            int n = arr.length;
            PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
            for (int num : arr) {
                pq.add(num);
            }

            int m1 = pq.poll();
            int m2 = pq.poll();
            return (m1 - 1) * (m2 - 1);

    }
}
