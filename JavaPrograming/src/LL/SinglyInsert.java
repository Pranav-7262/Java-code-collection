package LL;
 class SinglyNode1 {
      String data;
      SinglyNode1 next;

     SinglyNode1(String data) {
         this.data = data;
         this.next = null;
     }

     public void printlist(SinglyNode1 head) {
         while (head != null) {
             System.out.print(head.data + "->");
             head = head.next;
         }
         System.out.println("NULL");
     }

     public void setNext(SinglyNode1 next) {
         this.next = next;
     }

     public SinglyNode1 insertatfirst(SinglyNode1 head, String data) {
         SinglyNode1 newnode = new SinglyNode1(data);
         newnode.next = head;
         head = newnode;
         return head;
     }

     public SinglyNode1 insertatlast(SinglyNode1 head, String data) {
         SinglyNode1 newnode = new SinglyNode1(data);
         SinglyNode1 temp = head;
         while (temp.next != null) {
             temp = temp.next;
         }
         temp.next = newnode;
         return head;

     }

     public SinglyNode1 insertatindex(SinglyNode1 head, String data, int index) {
         SinglyNode1 newnode = new SinglyNode1(data);
         SinglyNode1 temp = head;
         SinglyNode1 temp1 = head.next;
         if (index==0){
            head =  insertatfirst(head, data);
             return head;
         }
         int i = 1;
         while (i <= index - 1) {
             temp = temp.next;
             temp1 = temp1.next;
             i++;
         }
         temp.next = newnode;
         newnode.next = temp1;
         return head;

     }
 }
     public class SinglyInsert {
         public static void main(String[] args) {
           SinglyNode1 n1 = new SinglyNode1("Pranav");
             SinglyNode1 n2 = new SinglyNode1("Pranav2");
             SinglyNode1 n3 = new SinglyNode1("Pranav3");
             SinglyNode1 n4 = new SinglyNode1("Pranav4");
             SinglyNode1 n5 = new SinglyNode1("Pranav5");
             n1.setNext(n2);
             n2.setNext(n3);
             n3.setNext(n4);
             n4.setNext(n5);
             System.out.println("List is:");
             n1.printlist(n1);
             System.out.println("After Inserting at First:");
             n1 = n1.insertatfirst(n1,"ram");
             n1.printlist(n1);
             System.out.println("After inserting at last:");
             n1= n1.insertatlast(n1,"Raju");
             n1.printlist(n1);

             System.out.println("After Inserting at random index");
             n1 = n1.insertatindex(n1,"Amrut",0);
             n1 = n1.insertatindex(n1,"Ketan",3);
             n1 = n1.insertatindex(n1,"manthan",4);
             n1.printlist(n1);
         }
     }
