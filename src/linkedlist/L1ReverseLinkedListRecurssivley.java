package linkedlist;

public class L1ReverseLinkedListRecurssivley {
    public static class Node{
        Node(int data){
            this.data=data;
        }
        int data;
        Node next;

    }

    static void main() {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        a.next=b;
        b.next=c;
        c.next=d;
        Node temp =a;
        reverseRecurringly(a);
    }

    public static void reverseRecurringly(Node head){
        if(head == null){
            return;
        }
        reverseRecurringly(head.next);
        System.out.print(head.data+" ");
    }
}


