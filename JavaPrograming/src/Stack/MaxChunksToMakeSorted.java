package Stack;

import java.util.Stack;

public class MaxChunksToMakeSorted {
    public static void main(String[] args) {
     int []arr = {2,1,3,4,4};
        System.out.println(maxChunksToSorted(arr));
    }
    public static int maxChunksToSorted(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for(int num : arr) {
            if(stack.isEmpty() || num >= stack.peek()) {
                stack.push(num);
            }
            else {
                int max = stack.pop();
                while(!stack.isEmpty() && stack.peek() > num) {
                    stack.pop();
                }
                stack.push(max);
            }
        }
        return stack.size();
    }
}
