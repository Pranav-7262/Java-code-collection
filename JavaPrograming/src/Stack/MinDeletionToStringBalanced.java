package Stack;

import java.util.Stack;

public class MinDeletionToStringBalanced {
    public static void main(String[] args) {
        String s = "aababbab";
        System.out.println(minimumDeletions(s));
    }
    public static int minimumDeletions(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;

        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && ch == 'a' && stack.peek() == 'b') {
                stack.pop();
                count++;
            }else {
                stack.push(ch);
            }
        }
        return count;
    }
}
