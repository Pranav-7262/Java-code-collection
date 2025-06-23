package Hashing;

import java.util.HashMap;

public class FirstRepeatingElement {
    public static void main(String[] args) {
    int []arr = {2,3,4,5,3,4,2,1};
        System.out.println(firstRepeated(arr));
    }
    public static int firstRepeated(int[] arr) {
        int n = arr.length;
        HashMap<Integer,Integer>hm = new HashMap<>();
        for (int num:arr){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        for (int i=0;i<n;i++){
            if (hm.get(arr[i])>1){
                return i+1;
            }
        }
        return -1;
    }
}
