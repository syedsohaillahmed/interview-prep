package linkedlist;

public class BasicLL {

    public static class Node{

        Node(int data){
            this.data=data;
        }

        int data;
        Node next;
    }

    static void main() {
        Node a = new Node(1);
        Node b = new Node(11);
        Node c = new Node(12);
        Node d = new Node(14);
        Node e = new Node(15);
        Node f = new Node(2);

        a.next=b;
        b.next=f;
        f.next=c;
        c.next=d;
        d.next=e;
//        System.out.println(f.next.next.next.data);

//        printing from loop
        Node temp=a;
//        System.out.println(temp.data);
//        for(int i=0; i<6; i++){
//            System.out.println(temp.data);
//            temp=temp.next; //temp=b,f,c,d,e
//        }

//        while (temp != null){
//            System.out.println(temp.data);
//            temp=temp.next;
//        }


//        didplay it through functions
        displayNode(a);
        System.out.println();

//        recurssivlry printing
        displayRecurrsivley(a);

    }

    public static void displayNode(Node a){
        Node temp=a;
        while (temp != null){
            System.out.print(temp.data +" ");
            temp=temp.next;
        }


    }

    public static void displayRecurrsivley(Node head){
        if(head == null){
            return;
        }

        displayRecurrsivley(head.next);
        System.out.print(head.data+", ");
    }
}
