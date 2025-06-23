package Stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class NextGreatestElement {
    public static void main(String[] args) {
     int []num1= {4,1,2};
     int []num2 = {1,3,4,2};
        System.out.println(Arrays.toString(nextGreaterElement(num1,num2)));
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>next_greatest = new HashMap<>();
        Stack<Integer> Stack = new Stack<>();
        for (int num:nums2){
            while (!Stack.isEmpty() && Stack.peek()< num){
                next_greatest.put(Stack.pop(),num);
            }
            Stack.push(num);
        }
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = next_greatest.getOrDefault(nums1[i],-1);
        }
        return nums1;
    }
}
