package LL;

class CircularNode1 {
    int data;
    CircularNode1 next;
    CircularNode1(int data) {
        this.data = data;
        this.next = null;
    }

    public void setNext(CircularNode1 next) {
        this.next = next;
    }
    public void printlist(CircularNode1 head) {
        CircularNode1 temp=head;

        do{

            System.out.print(temp.data+"->");
            temp=temp.next;

        }while(temp!=head);

        System.out.println("NULL");
    }
    public CircularNode1 insertFirst(CircularNode1 head,int data) {
        CircularNode1 node = new CircularNode1(data);
        CircularNode1 temp = head;
        while(temp.next!=head) {
            temp = temp.next;
        }
        temp.setNext(node);
        node.setNext(head);
        head = node;
        return head;

}
    public CircularNode1 insertLast(CircularNode1 head,int data) {
        CircularNode1 node = new CircularNode1(data);
        CircularNode1 temp = head;
        while(temp.next!=head) {
            temp = temp.next;
        }
        temp.setNext(node);
        node.setNext(head);
        return head;

    }
    public CircularNode1 insertRandom(CircularNode1 head,int data,int index) {
        CircularNode1 node = new CircularNode1(data);
        CircularNode1 temp1 = head;
        CircularNode1 temp2 = head.next;
        int i = 1;
        if (index == 0) {
            head = insertFirst(head, data);
            return head;
        }
        while(i<index-1) {
            temp1=temp1.next;
            temp2=temp2.next;
            i++;
        }
        temp1.setNext(node);
        node.setNext(temp2);
        return head;

    }
    }
public class CircularLLInsertion {
    public static void main(String[] args) {
        CircularNode1 n1 =new CircularNode1(1);
        CircularNode1 n2 =new CircularNode1(2);
        CircularNode1 n3 =new CircularNode1(3);
        CircularNode1 n4 =new CircularNode1(4);
        CircularNode1 n5 =new CircularNode1(5);
        CircularNode1 n6 =new CircularNode1(6);

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);
        n5.setNext(n6);
        n6.setNext(n1);

        System.out.println("The Linked List:");
        n1.printlist(n1);

        System.out.println("The Linked List After The InsertAtFirst:");
        n1=n1.insertFirst(n1,7);
        n1.printlist(n1);


        System.out.println("The Linked List After The InsertAtLast:");
        n1=n1.insertLast(n1,10);
        n1.printlist(n1);

        System.out.println("The Linked List After The InsertAtIndex:");
        n1=n1.insertRandom(n1,69,0);
        n1.printlist(n1);

    }
}
