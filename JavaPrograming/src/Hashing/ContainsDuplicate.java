package Hashing;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public static void main(String[] args) {
     int []nums={1,2,3,1};
     int k=3;
        System.out.println(containsduplicate(nums,k));
    }
    static boolean containsduplicate(int [] nums,int k){
        Map<Integer,Integer>hm=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!hm.containsKey(nums[i])){
                hm.put(nums[i],i );
            }
            else {
                int passindex=hm.get(nums[i]);
                if(Math.abs(passindex-i)<=k){
                    return true;
                }
                else {
                    hm.put(nums[i],i );
                }

            }

        }
        return false;
    }
}
