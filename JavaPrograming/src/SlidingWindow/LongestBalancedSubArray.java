package SlidingWindow;

import java.util.*;

public class LongestBalancedSubArray {
    public static void main(String[] args) {
        int[] nums = {2,5,4,3};
        System.out.println(longestBalancedSubarray(nums));
    }
    public static int longestBalancedSubarray(int[] nums) {
        Map<Integer, Integer> firstOccurrence = new HashMap<>();
        firstOccurrence.put(0, -1); // diff = 0 at index -1
        int diff = 0;
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {
            diff += (nums[i] % 2 == 0) ? 1 : -1; // +1 for even, -1 for odd
            if (firstOccurrence.containsKey(diff)) {
                maxLen = Math.max(maxLen, i - firstOccurrence.get(diff));
            } else {
                firstOccurrence.put(diff, i);
            }
        }
        return maxLen;

    }
}
