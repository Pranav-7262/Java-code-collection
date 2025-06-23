package Functions;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr={11,22,33,44,55};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0]=23;//Mapping 23 at index 0
        nums[2]=90;
    }
}
