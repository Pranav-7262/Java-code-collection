package Hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class IntersectionArrayII {
    public static void main(String[] args) {
      int [] a = {3, 4, 2, 2, 4} ; int [] b = {3, 2, 2, 7};
        System.out.println(commonElements(a,b));

    }
    public static ArrayList<Integer> commonElements(int nums1[], int nums2[]) {
        // Your code here

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int num:nums2){
            if(map.containsKey(num) && map.get(num)>0){
                list.add(num);
                map.put(num,map.get(num)-1);
            }

        }
        Collections.sort(list);
        return list;
    }
}
