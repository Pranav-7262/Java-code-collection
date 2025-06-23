package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayDuplicates {
    public static void main(String[] args) {
  int []arr = {0, 3, 1, 2,3,1};
        System.out.println(findDuplicates(arr));
    }
    public static List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer>hm = new HashMap<>();
        List<Integer>list = new ArrayList<>();
        for (int num:nums){
            hm.put(num, hm.getOrDefault(num, 0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()){
            if (entry.getValue()>1){
                list.add(entry.getKey());
            }
        }
        return list;
    }
}
