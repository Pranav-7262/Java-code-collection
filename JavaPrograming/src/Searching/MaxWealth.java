package Searching;

public class MaxWealth {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3},
                {3,2,1},
                {9,7,8},
        };
        System.out.println(maxwealth(arr));
    }
    static int maxwealth(int [][] accounts){
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum=0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum = sum + accounts[person][account];
            }
            if (sum>ans){
                ans = sum;
            }
        }
        return ans;
    }
}
