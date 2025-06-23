package Hashing;

import java.util.HashSet;

public class DistributeCandies {
    public static void main(String[] args) {
     int [] arr = {1,1,2,2,3,3};
        System.out.println(distributeCandies(arr));
    }
    public static int distributeCandies(int[] candyType) {
        int n = candyType.length;
        HashSet<Integer> set = new HashSet<>();
        int ans = n/2;
        for (int num:candyType){
            set.add(num);
        }
        if (set.size() > ans){
            return ans;
        } else {
            return set.size();
        }
    }
}
