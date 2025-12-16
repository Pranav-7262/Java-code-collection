package Bits;
import java.util.*;
public class MaximumANDValue {
    public static void main(String[] args) {
        System.out.println(maxAND(Arrays.asList(4, 8, 12, 16)));
    }
    public static int maxAND(List<Integer> arr) {
        // code here
        int maxi = 0;
        for (int bit = 31;bit >= 0; bit--) {
            int temp = maxi | (1 << bit);

            int count =0;
            for(int num : arr) {
                if((num & temp) == temp) {
                    count++;
                }
            }
            if (count >= 2) {
                maxi = temp;
            }
        }
        return maxi;
    }
}
