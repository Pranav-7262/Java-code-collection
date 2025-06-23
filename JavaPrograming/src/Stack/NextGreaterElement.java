package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
     int []arr = {5,2,6,1};
        System.out.println(nextLargerElement(arr));
    }
    public static ArrayList<Integer> nextLargerElement(int[] arr) {
        int n = arr.length;
        Stack<Integer>stack = new Stack<>();
        ArrayList<Integer>list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(-1);
        }
        for (int i = n-1; i >=0 ; i--) {
            while (!stack.isEmpty() && stack.peek()<=arr[i]){
                stack.pop();
            }
            if (!stack.isEmpty()){
                list.set(i, stack.peek());
            }
            stack.push(arr[i]);
        }
        return list;

    }
}
