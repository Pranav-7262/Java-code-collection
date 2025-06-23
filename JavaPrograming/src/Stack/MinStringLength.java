package Stack;

import java.util.Stack;

public class MinStringLength {
    public static void main(String[] args) {
    String s = "ABFCACDB";
        System.out.println(minLength(s));
    }
    public static int minLength(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()) {
            if(!stack.isEmpty()) {
                char top = stack.peek();
                if((top == 'A'&& ch == 'B') || (top == 'C' && ch == 'D')) {
                    stack.pop();
                    continue;
                }
            }
            stack.push(ch);

        }
        return stack.size();
    }
}
