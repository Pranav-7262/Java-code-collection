package Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SetMismatch {
    public static void main(String[] args) {
     int []arr = {1,2,2,4};
        System.out.println(Arrays.toString(new List[]{findErrorNums(arr)}));
    }
    public static List<Integer> findErrorNums(int[] nums) {
        HashMap<Integer,Integer>map = new HashMap<>();
        List<Integer>list = new ArrayList<>();
//        int duplicate = 0;
        for (int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i])>1){
//                duplicate = nums[i];
                list.add(nums[i]);
                
                break;
            }
        }
//        int miss = 0;
        for (int i = 1; i <= nums.length ; i++) {
            if (!map.containsKey(i)){
//                miss = i;
                list.add(i);
                break;
            }

        }
        return list;
    }
}
