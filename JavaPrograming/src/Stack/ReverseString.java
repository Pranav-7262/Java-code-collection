package Stack;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
     String s = "GeeksforGeeks";
        System.out.println(reverse(s));
    }
    public static String reverse(String S){
        Stack<Character>stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (char ch:S.toCharArray()){
            stack.push(ch);
        }
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
