package Queue;

public class ArrayQueue {
    private int[]queue;
    private int front;
    private int rear;
    private int capacity;

    // Constructor to initialize the queue
    public ArrayQueue(int capacity){
        this.capacity=capacity;
        this.queue = new int[capacity];
        this.front=0;
        this.rear=-1;
    }
    public boolean isEmpy(){
        return front>rear;
    }
    public boolean isFull(){
        return rear==capacity-1;
    }
    //enqueue
    public void enqueue(int data){
        if (isFull()){
            System.out.println("Queue Overflow!! you cant insert "+data);
            return;
        }
            queue[++rear]=data;
    }
    public int dequeue(){
        if (isEmpy()){
            System.out.println("Queue Underflow!! you cant insert");
            return -1;
        }
       return queue[front++];

    }
    public int peek(){
        if (isEmpy()){
            System.out.println("Queue Underflow!!");
            return -1;
        }
        return queue[front];

    }
    public void display(){
        if (isEmpy()){
            System.out.println("Queue Underflow!");
            return;
        }
        System.out.println("Queue Elements are:");
        for (int i = front; i <= rear; i++) {
            System.out.println(queue[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);
        queue.enqueue(88);
        queue.enqueue(44);
        queue.enqueue(45);
        queue.enqueue(89);
        System.out.println("removed:"+queue.dequeue());//FIFO (88 removed)
        queue.display();
        System.out.println("Peek is "+queue.peek());
        System.out.println(queue.dequeue());
        queue.display();





    }



}

