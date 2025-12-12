package Bits;

import java.util.Arrays;

public class DecodeXoredArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        System.out.println(Arrays.toString(decode(arr,1)));
    }
    public static int[] decode(int[] encoded, int first) {
        int n = encoded.length + 1;
        int[] arr = new int[n];

        arr[0] = first;
        for(int i=0;i<encoded.length;i++) {
            arr[i + 1] = encoded[i] ^ arr[i];
        }
        return arr;
    }
}
