package Hashing;

import java.util.HashMap;

public class SingleElement {
    public static void main(String[] args) {
  int []arr = {3, 2, 1, 34, 34, 1, 2, 34, 2, 1};
        System.out.println(singleElement(arr,10));
    }
    public static int singleElement(int[] arr , int N) {
        HashMap<Integer,Integer>hm = new HashMap<>();
        for (int num:arr){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        for (int i = 0; i < N; i++) {
            if (hm.get(arr[i])==1){
                return arr[i];
            }
        }
        return -1;
    }
}
