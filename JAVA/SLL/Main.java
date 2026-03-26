class Node {
    int data;
    Node next;

    //cons
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {

    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data );
            temp = temp.next;
        }

        System.out.println("null");
        System.out.println("");

    }
    public void displayLowest(){
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        int min = head.data;
        Node temp = head;

        while(temp!=null){
            if(temp.data<min){
                min = temp.data;
            }
            temp = temp.next;
        }
        System.out.println("Lowest number in the list: " + min);
    }
}

public class Main {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(-30);
        list.insert(40);

        System.out.println("Linked List:");
        list.display();
        list.displayLowest();
    }
}
