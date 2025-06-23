package Hashing;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {

  int []arr = {3, 1, 3, 3, 2};
        System.out.println(majorityElement(arr));
    }
    public static int majorityElement(int []arr) {
        int n = arr.length;
        HashMap<Integer,Integer>hm = new HashMap<>();
        for(int i:arr) {
            hm.put(i, hm.getOrDefault(i,0)+1);
        }
        int half = n/2;
        for(int i:arr) {
            if (hm.get(i)>half){
                return i;
            }
        }
        return -1;
    }
}
