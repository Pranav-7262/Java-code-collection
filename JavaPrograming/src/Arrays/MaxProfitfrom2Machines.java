package Arrays;

import java.util.Arrays;

public class MaxProfitfrom2Machines {
    public static void main(String[] args) {
    int x = 3;
    int y = 3;
    int a[] = {1, 2, 3, 4, 5};
    int b[] = {5, 4, 3, 2, 1};
        System.out.println(maxProfit(x,y,a,b));
    }
    public static int maxProfit(int x, int y, int[] a, int[] b) {
        // code here
        int n = a.length;
        int[][] tasks = new int[n][2];
        for(int i=0;i<n;i++) {
            tasks[i][0] = Math.abs(a[i] - b[i]);
            tasks[i][1] = i;
        }
        Arrays.sort(tasks ,(p1, p2) -> p2[0] - p1[0]);
        int pro = 0;
        for(int []arr : tasks) {
            int t = arr[1];
            if((a[t] >= b[t] && x > 0) || y == 0) {
                pro += a[t];
                x--;
            }else {
                pro += b[t];
                y--;
            }
        }
        return pro;
    }
}
