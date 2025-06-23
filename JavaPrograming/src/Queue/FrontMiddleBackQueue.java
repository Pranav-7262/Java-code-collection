package Queue;

import java.util.LinkedList;

public class FrontMiddleBackQueue {
    private LinkedList<Integer>queue;
    private int size;

    public FrontMiddleBackQueue(){
        queue = new LinkedList<>();
        size=0;
    }
    public void pushback(int val) {
        queue.add(val);
        size++;
    }
    public void pushFront(int val) {
        queue.addFirst(val);
        size++;
    }
    public int popFront() {
        if (size==0) {
            return -1;
        }
        size--;
        return queue.pollFirst();
    }
    public int popBack() {
        if (size==0) {
            return -1;
        }
        size--;
        return queue.pollLast();
    }
    public int popMiddle() {
        if (size==0) {
            return -1;
        }
        int Mid = (size-1)/2;
        int midelement = queue.remove(Mid);
        size--;
        return midelement;
    }
    public int getMiddle() {
        if (size==0) {
            return -1;
        }

        return queue.get(size/2);
    }
    public int getSize() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public void display() {
        for (int i:queue) {
            System.out.print(i +" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        FrontMiddleBackQueue queue = new FrontMiddleBackQueue();
        queue.pushFront(23);
        queue.pushback(56);
        queue.pushFront(45);
        queue.display();
        System.out.println(queue.getMiddle());//23
        System.out.println(queue.popBack());//56
        System.out.println(queue.popFront());//45
        queue.display();
    }

}
