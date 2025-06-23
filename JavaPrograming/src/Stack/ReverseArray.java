package Stack;

import java.util.Arrays;
import java.util.Stack;

public class ReverseArray {
    public static void main(String[] args) {
    int []arr = {2,3,4,5,6};
        System.out.println(Arrays.toString(reverseArray(arr)));
    }
    public static int[] reverseArray(int[] arr) {
        int len = arr.length;
        Stack<Integer>stack = new Stack<>();
        for (int num:arr){
            stack.push(num);
        }
        for (int i = 0; i < len; i++) {
            arr[i] = stack.pop();
        }
        return arr;
    }
}
