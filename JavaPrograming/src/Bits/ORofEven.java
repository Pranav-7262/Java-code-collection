package Bits;

public class ORofEven {
    public static void main(String[] args) {
   int [] arr = {3,4,5,2,7,8,6};
        System.out.println(evenNumberBitwiseORs(arr));
    }
    public static int evenNumberBitwiseORs(int[] nums) {
        int or = 0;
        for(int val : nums) {
            if((val & 1) != 1) {
                or |= val;
            }
        }
        return or;
    }
}
