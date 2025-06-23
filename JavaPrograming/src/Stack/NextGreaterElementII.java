package Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementII {
    public static void main(String[] args) {
  int []arr = {1,2,3,4,3};
        System.out.println(Arrays.toString(nextGreaterElements(arr)));
    }
    public static int[] nextGreaterElements(int[] nums) {
        Stack<Integer>stack = new Stack<>();
        int []arr = new int[nums.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
        for (int i = 0; i < nums.length; i++) {
            while (!stack.empty() && nums[stack.peek()] < nums[i]) {
                    arr[stack.pop()] =nums[i];
            }

              stack.push(i);
            }

        return arr;
    }
}
