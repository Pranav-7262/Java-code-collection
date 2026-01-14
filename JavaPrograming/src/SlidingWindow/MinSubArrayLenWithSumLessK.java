package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class MinSubArrayLenWithSumLessK {
    public static void main(String[] args) {
   int []arr = {2,2,3,1} ;
   int k = 4;
        System.out.println(minLength(arr,k));

    }
    public static int minLength(int[] nums, int k) {
        int n = nums.length;
        int start = 0;
        int sum = 0;
        int minlen = Integer.MAX_VALUE;
        Map<Integer , Integer> map = new HashMap<>();
        for(int i=0;i<n;i++) {
            map.put(nums[i] , map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i]) ==1){
                sum += nums[i];
            }
            while(sum >= k) {
                minlen = Math.min(minlen , i - start + 1);
                map.put(nums[start] , map.get(nums[start])-1);
                if(map.get(nums[start]) == 0) {
                    sum -= nums[start];
                }
                start++;
            }
        }
        return minlen == Integer.MAX_VALUE ? -1 : minlen;
    }
}
