package Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SingleNumberII {
    public static void main(String[] args) {
     int []arr = {1,2,1,3,2,5};
        System.out.println(Arrays.toString(singleNumber(arr)));
    }
    public static int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer>hm = new HashMap<>();
        int []res = new int[2];
        for (int num:nums) {
            hm.put(num, hm.getOrDefault(num, 0)+1);
        }
        int cnt = 0;
        for(int i=0;i<nums.length;i++){
            if(hm.get(nums[i])==1){
                res[cnt++] = nums[i];
            }
        }
        return res;

    }
}
