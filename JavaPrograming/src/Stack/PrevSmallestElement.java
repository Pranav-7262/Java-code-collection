
package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class PrevSmallestElement {
    public static void main(String[] args) {
    int [] arr = {1, 5, 0, 3, 4, 5};
        System.out.println(help_classmate(arr));
    }
    public static ArrayList<Integer> help_classmate(int arr[]) {
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();

        Stack<Integer>stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                list.add(stack.peek());
            }else {
                list.add(-1);
            }
            stack.push(arr[i]);

        }
        return list;
    }
}
