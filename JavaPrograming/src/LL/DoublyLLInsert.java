package LL;
class DoublyNode1 {
    private String data;
    private DoublyNode1 next;
    private DoublyNode1 prev;

    DoublyNode1(String data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
    public void setNext(DoublyNode1 next) {
        this.next = next;
    }

    public void setPrev(DoublyNode1 prev) {
        this.prev = prev;
    }

    public void printlist(DoublyNode1 head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("NULL");
    }
    public void printLinkedListByPrev(DoublyNode1 tail){

        while(tail!=null){

            System.out.print(tail.data+"->");
            tail=tail.prev;

        }

        System.out.println("START");

    }

    public DoublyNode1 insertatfirst(DoublyNode1 head, String data) {
        DoublyNode1 newnode = new DoublyNode1(data);
        if (head == null) {
            return null;
        }
        newnode.setNext(head);
        head.setPrev(newnode);
        head = newnode;
        return head;

    }

    public DoublyNode1 insertatlast(DoublyNode1 head, String data) {
        DoublyNode1 newnode = new DoublyNode1(data);
        DoublyNode1 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
        newnode.prev = temp;
        temp = newnode;
        return temp;

    }

    public DoublyNode1 insertatindex(DoublyNode1 head, String data, int index) {
        DoublyNode1 newNode=new DoublyNode1(data);
        int i=1;
        DoublyNode1 temp1=head;
        DoublyNode1 temp2=head.next;
        if(index==0){
           head =  insertatfirst(head,data);
           return head;
        }
        while(i<index){
            temp1=temp1.next;
            temp2=temp2.next;
            i++;
        }


        temp1.setNext(newNode);
        newNode.setPrev(temp1);

        newNode.setNext(temp2);
        temp2.setPrev(newNode);

        return head;

    }
}

public class DoublyLLInsert {
    public static void main(String[] args) {
        DoublyNode1 n1 = new DoublyNode1("Pranav");
        DoublyNode1 n2 = new DoublyNode1("Pranav2");
        DoublyNode1 n3 = new DoublyNode1("Pranav3");
        DoublyNode1 n4 = new DoublyNode1("Pranav4");
        DoublyNode1 n5 = new DoublyNode1("Pranav5");
        n1.setNext(n2);

        n2.setPrev(n1);
        n2.setNext(n3);

        n3.setPrev(n2);
        n3.setNext(n4);

        n4.setPrev(n3);
        n4.setNext(n5);
        n5.setPrev(n4);
        n5.setNext(null);
        System.out.println("Linked List By Next:");
        n1.printlist(n1);

        System.out.println("Linked List by Previous:");
        n5.printLinkedListByPrev(n5);

        System.out.println("After inserting at First");
        n1= n1.insertatfirst(n1,"Raju");
        n1.printlist(n1);
        System.out.println("After inserting at Last");
        n5= n5.insertatlast(n5,"Ram");
        n1.printlist(n1);
//
        System.out.println("After Inserting at random index");
        n1 = n1.insertatindex(n1,"Amrut",3);
        n1.printlist(n1);
        n5.printLinkedListByPrev(n5);

//        n1 = n1.insertatindex(n1,"Ketan",3);
//        n1 = n1.insertatindex(n1,"manthan",4);
//        n1.printlist(n1);
    }
}
