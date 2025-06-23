package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsing2Queues {
    Queue<Integer>queue1 = new LinkedList<>();
    Queue<Integer>queue2 = new LinkedList<>();
    public void push(int val){
        while (!queue1.isEmpty()){
            queue2.offer(queue1.poll());
        }
        queue1.offer(val);
        while (!queue2.isEmpty()){
            queue1.offer(queue2.poll());
        }
    }
    public int pop(){
        if (queue1.isEmpty()){
            System.out.println("You cant pop because queue is empty");
            return -1;
        }
        return queue1.poll();
    }
    public int peek(){
        if (queue1.isEmpty()){
            System.out.println("You cant pop because queue is empty");
            return -1;
        }
        return queue1.peek();
    }
    public void display(){
        if (queue1.isEmpty()){
            System.out.println("You cant pop because queue is empty");
            return;
        }
        System.out.println("printing elements:");
        for (int nums:queue1) {
            System.out.print(nums+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackUsing2Queues stack = new StackUsing2Queues();
        stack.push(73);
        stack.push(33);
        stack.push(23);
        stack.push(56);
        stack.display();
        System.out.println("Peeked element is:"+stack.peek());
        System.out.println("Popped:"+stack.pop());
        System.out.println("Popped:"+stack.pop());
        stack.display();

    }
}
