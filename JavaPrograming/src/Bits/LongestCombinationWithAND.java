package Bits;

public class LongestCombinationWithAND {
    public static void main(String[] args) {
     int [] arr = {16,17,71,62,12,24,14};
        System.out.println(largestCombination(arr));
    }
    public static int largestCombination(int[] candidates) {
        int n = candidates.length;
        int  ans = 0;
        for(int bit=0;bit<25;bit++) {
            int count = 0;
            for(int i=0;i<n;i++) {
                if((candidates[i] & (1 << bit)) != 0) {
                    count++;
                }
            }
            ans = Math.max(ans , count);
        }
        return ans;
    }
}
