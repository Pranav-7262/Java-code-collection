package Arrays;

import java.util.Arrays;

public class FindMaxValue {

    public static void main(String[] args) {
  int n = 10;
  int [][] restrictions = { {3,1},{8,1}};
  int []  diff = {2,2,3,1,4,5,1,1,2};
        System.out.println(findMaxVal(n,restrictions,diff));
    }
    public static int findMaxVal(int n, int[][] restrictions, int[] diff) {

        long [] maxi = new long[n];
        Arrays.fill(maxi, Long.MAX_VALUE);
        maxi[0] = 0;
        for (int []r : restrictions) {
            int idx = r[0];
            int maxVal = r[1];
            maxi[idx] = Math.min(maxi[idx] , maxVal);
        }
        for (int i = 1; i < n; i++) {
            maxi[i] = Math.min(maxi[i] , maxi[i-1] + diff[i-1]);
        }
        for (int i = n - 1; i > 0; i--) {
            maxi[i - 1] = Math.min(maxi[i - 1], maxi[i] + diff[i - 1]);
        }
        long ans = 0;
        for (long val : maxi) {
            ans = Math.max(ans, val);
        }

        return (int) ans;
    }
}
