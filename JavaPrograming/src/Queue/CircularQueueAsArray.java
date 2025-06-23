package Queue;

public class CircularQueueAsArray {
    private int[]queue;
    private int front;
    private int rear;
    private int size;

    // Constructor to initialize the queue
    public CircularQueueAsArray(int capacity){
        queue=new int[capacity];
        front=-1;
        rear=-1;
        size=capacity;
    }
    public boolean isEmpy(){
        return front==-1;
    }
    public boolean isFull(){
        return front==(rear+1)%size;
    }
    public int frontgive(){
        if (isEmpy()){
            System.out.println("Queue Underflow!! you cant insert");
            return -1;
        }
        return queue[front];
    }
    public int reargive(){
        if (isEmpy()){
            System.out.println("Queue Underflow!! you cant insert");
            return -1;
        }
        return queue[rear];
    }
    //enqueue
    public boolean enqueue(int data){
        if (isFull()){
            System.out.println("Queue Overflow!! you cant insert "+data);
            return false;
        }
        if (front==-1){
            front=0;
        }
        rear = (rear+1)%size;
        queue[rear]=data;
        return true;

    }
    public int dequeue(){
        if (isEmpy()){
            System.out.println("Queue Underflow!! you cant insert");
            return -1;
        }
        int item = queue[front];
        if (front==rear){
            front=-1;
            rear=-1;
        }
        else{
            front = (front+1)%size;
        }

        return item;
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

        for (int i = front; i < rear; i++) {
            System.out.print(queue[i]+" -> ");
        }
        System.out.print(queue[rear]+" ");
        System.out.println();
    }
    public int size() {
        if (isEmpy()) {
            return 0;
        } else if (rear >= front) {
            return rear - front + 1; // Simple subtraction when rear is ahead of front
        } else {
            return size - front + rear + 1;
        }
    }


    public static void main(String[] args) {
  CircularQueueAsArray q = new CircularQueueAsArray(5);
    q.enqueue(90);
    q.enqueue(79);
    q.enqueue(23);
    q.enqueue(56);
    q.display();
        System.out.println("Dequeued: "+q.dequeue());
        System.out.println("Dequeued: "+q.dequeue());
   q.display();
        System.out.println("The Size is: "+q.size());
        System.out.println(q.frontgive());
        System.out.println(q.reargive());




    }
}
