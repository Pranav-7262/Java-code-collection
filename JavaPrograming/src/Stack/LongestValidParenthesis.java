package Stack;

import java.util.Stack;

public class LongestValidParenthesis {
    public static void main(String[] args) {
      String s = ")()())";
        System.out.println(longestValidParentheses(s));
    }
    public static int longestValidParentheses(String s) {
        Stack<Integer>stack = new Stack<>();
        int max = 0;
        stack.push(-1);
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '(') {
                stack.push(i);
            }
            else {
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }
                max = Math.max(max,i-stack.peek());
            }
        }
        return max;

    }

}
