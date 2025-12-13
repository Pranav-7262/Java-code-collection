package Bits;

import java.util.*;

public class XorOfNumbersWhich2Occ {
    public static void main(String[] args) {
      int [] arr = {1,2,1,3};
        System.out.println(duplicateNumbersXOR(arr));
    }
    public static int duplicateNumbersXOR(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int xor = 0;
        for(int val : nums) {
            if(set.contains(val)) {
                xor ^= val;
            }else {
                set.add(val);
            }
        }
        return xor;
    }
}
