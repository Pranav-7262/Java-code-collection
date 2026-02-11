package Arrays;

public class MaxProfit {
    public static void main(String[] args) {
        int[] arr = {7, 10, 1, 3, 6, 9, 2};
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int[] prices) {
        // Code here
        int n = prices.length;

        int maxprofit = 0;
        for (int i = 0; i < n; i++) {
            int mini = prices[i];
            int maxi = prices[i];
            for (int j = i + 1; j < n; j++) {
                maxi = Math.max(maxi, prices[j]);
            }
            maxprofit = Math.max(maxprofit, maxi - mini);
        }


        return maxprofit;
    }
}
