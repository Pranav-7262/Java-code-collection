package LL;

class CircularNode2 {
    int data;
    CircularNode2 next;
    CircularNode2(int data) {
        this.data = data;
        this.next = null;
    }

    public void setNext(CircularNode2 next) {
        this.next = next;
    }


    public void printLinkedList(CircularNode2 head){
      CircularNode2 temp=head;
        do{
            System.out.print(temp.data+"->");
        temp=temp.next;

      }while(temp!=head);
        System.out.println("NULL");
   }
   public CircularNode2 deleteFirst(CircularNode2 head) {
        CircularNode2 temp = head;
        while (temp.next!=head) {
            temp = temp.next;
        }
        head = head.next;
        temp.next = head;
        return head;
   }
    public CircularNode2 deleteLast(CircularNode2 head) {
        CircularNode2 temp = head;
        while (temp.next.next!=head) {
            temp = temp.next;
        }
         temp.setNext(head);
         return head;
    }
    public CircularNode2 deleteAtIndex(CircularNode2 head,int index) {

        CircularNode2 temp1 = head;
        CircularNode2 temp2 = head.next;

        int i = 1;
        if (index == 0) {
            head = deleteFirst(head);
            return head;
        }
        while (i<index) {
            temp1 = temp1.next;
            temp2 = temp2.next;
            i++;
        }
        temp1.setNext(temp2.next);
        return head;
    }
}
public class CircularLLDeletion {
    public static void main(String[] args) {
      CircularNode2 n1 = new CircularNode2(34);
      CircularNode2 n2 = new CircularNode2(55);
      CircularNode2 n3 = new CircularNode2(78);
      CircularNode2 n4 = new CircularNode2(23);
      CircularNode2 n5 = new CircularNode2(89);

      n1.setNext(n2);
      n2.setNext(n3);
      n3.setNext(n4);
      n4.setNext(n5);
      n5.setNext(n1);

        System.out.println("Printing Linked List");
        n1.printLinkedList(n1);

        System.out.println("After Deleting at First");
        n1 = n1.deleteFirst(n1);
        n1.printLinkedList(n1);

        System.out.println("The Linked List After The DeleteAtLast:");
        n1=n1.deleteLast(n1);
        n1.printLinkedList(n1);

        System.out.println("The Linked List After The DeleteAtIndex:");
        n1=n1.deleteAtIndex(n1,2);
        n1.printLinkedList(n1);

    }
}
