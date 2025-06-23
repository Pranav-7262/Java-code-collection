package LL;

  class SinglyNode {
       String data;
       SinglyNode next;

      SinglyNode(String data) {
          this.data = data;
          this.next = null;
      }

      public void printlist(SinglyNode head) {
          while (head != null) {
              System.out.print(head.data + "->");
              head = head.next;
          }
          System.out.println("NULL");
      }

      public void setNext(SinglyNode next) {
          this.next = next;
      }

      public SinglyNode deletefirst(SinglyNode head) {
          if (head == null) {
              return null;
          }
          head = head.next;
          return head;
      }

      public SinglyNode deletelast(SinglyNode head) {
          if (head == null) {
              return null;
          } else {
              SinglyNode temp = head;
              SinglyNode temp2 = head.next;

              while (temp2.next != null) {
                  temp = temp.next;
                  temp2 = temp2.next;
              }
              temp.setNext(null);
              return head;
          }
      }

      public SinglyNode deleteatindex(SinglyNode head, int index) {
          if(index < 0 ){
              return null;
          }
          SinglyNode temp = head;
          for (int i = 1; i < index; i++) {
              temp = temp.next;
          }
          temp.next = temp.next.next;
          return head;
      }
  }
  public class SinglyNode2 {
      public static void main(String[] args) {
          SinglyNode n1 = new SinglyNode("A");
          SinglyNode n2 = new SinglyNode("B");
          SinglyNode n3 = new SinglyNode("C");
          SinglyNode n4 = new SinglyNode("D");
          SinglyNode n5 = new SinglyNode("E");
          SinglyNode n6 = new SinglyNode("F");
          n1.setNext(n2);
          n2.setNext(n3);
          n3.setNext(n4);
          n4.setNext(n5);
          n5.setNext(n6);
          System.out.println("The linked list:");
          n1.printlist(n1);
          System.out.println("After deleting first element");
          n1 =  n1.deletefirst(n1);
          n1.printlist(n1);

          System.out.println("The Linked List After The  DeleteAtLast:");
          n1 = n1.deletelast(n1);
          n1.printlist(n1);

          System.out.println("The Linked List After The  DeleteAtIndex:");
          n1 = n1.deleteatindex(n1,2);
          n1.printlist(n1);
      }
  }
