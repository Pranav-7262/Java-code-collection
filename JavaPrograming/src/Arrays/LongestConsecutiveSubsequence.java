package Arrays;

import java.util.Arrays;

public class LongestConsecutiveSubsequence {
    public static void main(String[] args) {
  int [] arr = {2, 6, 1, 9, 4, 5, 3};
        System.out.println(longestConsecutive(arr));
    }
    public static int longestConsecutive(int[] arr) {
        if (arr.length ==0) return 0;
        Arrays.sort(arr);
        int cnt=1,longest=1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]==arr[i-1]) continue;
            else if (arr[i]==arr[i-1]+1) {
                cnt++;
            }
            else {
                longest = Math.max(longest,cnt);
                cnt=1;
            }
        }
        return Math.max(longest,cnt);
    }
}
