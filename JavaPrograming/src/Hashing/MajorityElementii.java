package Hashing;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class MajorityElementii {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,1};
        System.out.println(majorityElement(arr));
    }
    public static List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer>list = new ArrayList<>();
        HashMap<Integer,Integer>hm = new HashMap<>();
        for(int num:nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        int half = n/3;
        for (int num:hm.keySet()){
            if (hm.get(num)>half){
                list.add(num);
            }
        }
        return list;

    }
}
