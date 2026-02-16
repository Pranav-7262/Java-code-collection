package Hashing;

import java.util.HashMap;

public class FirstElementUniqueFrequency {
    public static void main(String[] args) {
        int [] arr = {20,10,30,30};
        System.out.println(firstUniqueFreq(arr));
    }
    public static int firstUniqueFreq(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num , map.getOrDefault(num , 0)+1);
        }
        HashMap<Integer , Integer> fCount = new HashMap<>();
        for(int num : map.values()) {
            fCount.put(num , fCount.getOrDefault(num , 0)+1);
        }
        for(int i=0;i<nums.length;i++) {
            if(fCount.get(map.get(nums[i]) ) == 1){
                return nums[i];
            }
        }
        return -1;
    }
}
