package Stack;

public class StackAsArray {
    private int[]stack;
    private int top;
    private int capacity;

  public StackAsArray(int capacity){
      this.capacity=capacity;
      stack = new int[capacity];
      top=-1;
  }
   public void push(int value){
      if (isFull()){
          System.out.println("Stack OverFlow!! you can push"+value);
          return;
      }
      stack[++top]=value;
   }
    public int pop(){
        if (isEmpty()){
            System.out.println("Stack OUnderFlow!! you cant pop");
            return -1;
        }
       return stack[top--];
    }
    public int peek(){
        if (isEmpty()){
            System.out.println("Stack OverFlow!! you cant push");
            return -1;
        }
        return stack[top];
    }
    public boolean isEmpty(){
      return top==-1;
    }
    public boolean isFull(){
        return top==capacity-1;
    }
    public int isSize(){
        return top+1;
    }
    public void display(){
        if (isEmpty()){
            System.out.println("Stack OverFlow!! you cant push");
            return;
        }
        System.out.println("Stack elements are:");
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackAsArray stack = new StackAsArray(5);
        stack.push(78);
        stack.push(89);
        stack.push(45);
        stack.push(90);
        stack.display();
        System.out.println("Popped element:"+stack.pop());
        System.out.println("Top Element:"+stack.peek());
        System.out.println("Size:"+stack.isSize());
        stack.display();

    }
}
