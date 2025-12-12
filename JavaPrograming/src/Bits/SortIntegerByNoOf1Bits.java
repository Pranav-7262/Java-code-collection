package Bits;

import java.util.Arrays;

public class SortIntegerByNoOf1Bits {
    public static void main(String[] args) {
  int []arr = {0,1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(sortByBits(arr)));
    }
    public static int[] sortByBits(int[] arr) {
        Integer[] temp = new Integer[arr.length];
        for (int i = 0;i<arr.length;i++) {
            temp[i] = arr[i];
        }
        Arrays.sort(temp , (a,b) -> {
            int c1 = Integer.bitCount(a);
            int c2 = Integer.bitCount(b);
            if( c1 == c2) return a-b;
            return c1-c2;
        });
        for (int i = 0;i<arr.length;i++) {
            arr[i] = temp[i];
        }
        return arr;
    }
}
