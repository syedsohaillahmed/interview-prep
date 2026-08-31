package practice;

public class InsertElementsATLinkedList {

    public static class Node{

        Node(int data){
            this.data = data;
        }

        int data;
        Node next;
    }

    public static class LinkedList{

        Node head=null;
        Node tail=null;

        void addAtEnd(int value){
            Node temp = new Node(value);
            if(head==null){
                head=temp;
            }else {
                tail.next=temp;
            }
            tail=temp;


        }

        void display(){
            Node temp = head;
            while(temp != null){
                System.out.println(temp.data);
                temp=temp.next;

            }
        }




    }

    static void main() {
        LinkedList l = new LinkedList();
        l.addAtEnd(1);
        l.addAtEnd(2);
        l.addAtEnd(3);

        l.display();
        l.display();
    }


}
