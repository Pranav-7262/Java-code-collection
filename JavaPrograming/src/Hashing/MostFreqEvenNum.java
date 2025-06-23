package Hashing;

import java.util.HashMap;

public class MostFreqEvenNum {
    public static void main(String[] args) {
   int []arr = {4,4,4,9,2,4};
        System.out.println(mostFrequentEven(arr));
    }
    public static int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer>hm = new HashMap<>();
        for (int num:nums) {
            if (num % 2 == 0) {
                hm.put(num, hm.getOrDefault(num, 0)+1);
            }
        }
        if (hm.isEmpty()){
            return -1;
        }
        int maxval = Integer.MIN_VALUE;
        int smallval = Integer.MAX_VALUE;
        for (var n:hm.entrySet()){
            if (n.getValue()>maxval){
                maxval = n.getValue();
                smallval = n.getKey();
            } else if (n.getValue()==maxval) {
                smallval = Math.min(smallval, n.getKey());
            }
        }
        return smallval;
    }
}
