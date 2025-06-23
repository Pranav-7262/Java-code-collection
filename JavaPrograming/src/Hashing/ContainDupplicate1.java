package Hashing;

import java.util.HashMap;

public class ContainDupplicate1 {
    public static void main(String[] args) {
      int [] nums={11,22,33,44,55,66,55};
        System.out.println(containduplicate(nums));
    }
    static boolean containduplicate(int []nums){
        HashMap<Integer,Integer>hm=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(hm.containsKey(nums[i])){
                return true;
            }
            hm.put(nums[i],i );
        }
        return false;
    }
}
