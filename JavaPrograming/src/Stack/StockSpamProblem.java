package Stack;

import java.util.*;

public class StockSpamProblem {
    public static void main(String[] args) {
        int [] arr = {100, 80, 90, 120};
        System.out.println(calculateSpan(arr));
    }
    public static ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();

        int n = arr.length;
        for(int i=0;i<n;i++) {
            while(!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            int count;
            if(stack.isEmpty()) {
                count = i+1;
            }else {
                count = i - stack.peek();
            }
            list.add(count);
            stack.push(i);

        }
        return list;
    }
}
