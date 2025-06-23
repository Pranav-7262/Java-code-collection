package Stack;

import java.util.Stack;

public class InBuiltExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(12);
        stack.push(56);
        stack.push(85);
        stack.push(44);
        stack.push(98);
        System.out.println(stack);//print the stack
        stack.pop();
        System.out.println(stack);//number 98 will be removed(LIFO)
        System.out.println(stack.pop());//44
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
