package Hashing;

import java.util.HashMap;

public class MostFrequentFollowedKey {
    public static void main(String[] args) {
  int [] arr = {1,100,200,1,100};
  int key = 1;
        System.out.println(mostFrequent(arr,key));
    }
    public static int mostFrequent(int[] nums, int key) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] == key){
            map.put(nums[i+1], map.getOrDefault(nums[i+1],0)+1 );
            }
        }
        int result = 0;
        int maxcnt = -1;
        for (int num:nums){
            int cnt = map.get(num);
            if (cnt>maxcnt){
                maxcnt = cnt;
                result = num;
            }
        }
        return result;
    }
}
