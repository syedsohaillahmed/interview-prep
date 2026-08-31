package linkedlist;

public class L2AddElemntAtLast  {

    public static class Node{
        Node(int data){
            this.data=data;
        }
        int data;
        Node next;
    }

    public static class LinkedList{
        Node head=null;
        Node tail=null;


        void insertAtEnd(int val){
            Node temp=new Node(val);

            if(head == null){
                head=temp;
            }else{
                tail.next=temp;
            }
            tail=temp;

        }

        void display(){
            Node temp=head;
            while (temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    static void main() {
        LinkedList l = new LinkedList();
        l.insertAtEnd(1);
        l.insertAtEnd(2);

l.display();
l.display();

    }
}
