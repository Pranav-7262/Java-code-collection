package Stack;
import java.util.Arrays;
import java.util.Stack;
public class NextSmallerElement {
    public static void main(String[] args) {
  int []arr = {3, 8, 5, 2, 25};
        System.out.println(Arrays.toString(help_classmate(arr,5)));
    }
    public static int[] help_classmate(int arr[], int n) {
        // Your code goes here
        int []ans = new int[n];

        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++) {
            while(!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                ans[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            ans[stack.pop()] = -1;
        }
        return ans;
    }
}
