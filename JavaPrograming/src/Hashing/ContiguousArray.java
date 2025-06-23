package Hashing;

import java.util.HashMap;

public class ContiguousArray {
    public static void main(String[] args) {
  int []arr = {0,1,0};
        System.out.println(findMaxLength(arr));
    }
    public static int findMaxLength(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0){
                sum += -1;
            }else{
                sum += 1;
            }
            if (map.containsKey(sum)){
                max = Math.max(max,i- map.get(sum));
            } else {
                map.put(sum,i);
            }

        }
        return max;
    }
}
