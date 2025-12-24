package Bits;

public class XOROfAllPairings {
    public static void main(String[] args) {
  int []arr1 = {2,1,3};
  int []arr2 = {10,2,5,0};
        System.out.println(xorAllNums(arr1,arr2));
    }
    public static int xorAllNums(int[] nums1, int[] nums2) {
        int xor1 = 0;
        int xor2 = 0;
        for(int num : nums1) {
            xor1 ^= num;
        }
        for(int num : nums2) {
            xor2 ^= num;
        }
        int res = 0;
        if((nums2.length & 1) == 1){
            res ^= xor1;
        }
        if((nums1.length & 1) == 1){
            res ^= xor2;
        }
        return res;
    }
}
//If a value appears even times → it disappears
//If a value appears odd times → it remains
//An element survives XOR only if it appears an odd number of times.