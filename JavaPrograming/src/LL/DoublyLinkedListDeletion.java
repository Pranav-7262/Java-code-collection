package LL;

class DoublyNode2{

    String data;
    DoublyNode2 next;
    DoublyNode2 prev;

    DoublyNode2(String data){

        this.data=data;
        this.next=null;
        this.prev=null;

    }

    public void setNext(DoublyNode2 next){

        this.next=next;

    }
    public void setPrev(DoublyNode2 prev){

        this.prev=prev;

    }

    public void printLinkedListByNext(DoublyNode2 head){

        while(head!=null){

            System.out.print(head.data+"->");
            head=head.next;

        }
        System.out.println("NULL");
    }

    public void printLinkedListByPrev(DoublyNode2 tail){

        while(tail!=null){

            System.out.print(tail.data+"->");
            tail=tail.prev;

        }
        System.out.println("NULL");
    }

    public DoublyNode2 deleteAtFirst(DoublyNode2 head){

        DoublyNode2 temp=head.next;

        temp.setPrev(head.prev);

        head=temp;

        return head;

    }
    public int size(DoublyNode2 head) {
        int count = 0;
        while (head!=null){
            count++;
            head = head.next;
        }
        return count;
    }

    public DoublyNode2 deleteAtLast(DoublyNode2 tail){

        DoublyNode2 temp=tail.prev;

        temp.setNext(tail.next);

        tail=temp;

        return tail;
    }

    public DoublyNode2 deleteAtIndex(DoublyNode2 head,int index){
        if (head == null || index==0) {
            return head;
        }
        if (index==1) {
            head = deleteAtFirst(head);
            return head;
        }

        int i=1;
        DoublyNode2 temp1=head;
        DoublyNode2 temp2=head.next;

        while (temp2 != null && i < index - 1) {
            temp1 = temp1.next;
            temp2 = temp2.next;
            i++;
        }

        if (temp2 == null || temp2.next == null) {
            // Index is out of bounds
            System.out.println("Invalid operation: Index out of bounds.");
            return head;
        }

        // Remove the node
        DoublyNode2 nodeToDelete = temp2.next;
        temp2.setNext(nodeToDelete.next);
        if (nodeToDelete.next != null) {
            nodeToDelete.next.setPrev(temp2);
        }

        return head;
    }

}
public class DoublyLinkedListDeletion {
    public static void main(String[] args){

        DoublyNode2 n1=new DoublyNode2("Altaf");
        DoublyNode2 n2=new DoublyNode2("Vivek");
        DoublyNode2 n3=new DoublyNode2("Shreyash");
        DoublyNode2 n4=new DoublyNode2("Abhijeet");
        DoublyNode2 n5=new DoublyNode2("Rohan");
        DoublyNode2 n6=new DoublyNode2("Nitish");


        n1.setNext(n2);

        n2.setPrev(n1);
        n2.setNext(n3);


        n3.setPrev(n2);
        n3.setNext(n4);

        n4.setPrev(n3);
        n4.setNext(n5);

        n5.setPrev(n4);
        n5.setNext(n6);

        n6.setPrev(n5);
        n6.setNext(null);

        System.out.println("Linked List By Next:");
        n1.printLinkedListByNext(n1);

        System.out.println("Linked List By Previous:");
        n6.printLinkedListByPrev(n6);


        System.out.println("Linked List After The DeleteAtFirst:");
        n1=n1.deleteAtFirst(n1);


        n1.printLinkedListByNext(n1);
        System.out.println("Linked List After The DeleteAtLast:");
        n6=n6.deleteAtLast(n6);


        n1.printLinkedListByNext(n1);



        System.out.println("Linked List After The DeleteAtIndex:");
        n1=n1.deleteAtIndex(n1,4);

        n1.printLinkedListByNext(n1);
        n1.deleteAtIndex(n1,2);
        System.out.println(n1.size(n1));
    }
}