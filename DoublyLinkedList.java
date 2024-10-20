class DoublyLinkedList {

    Node head;

    // Structure of node
    class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;

        }
    }

    // Adding Node in the Start of the Doublylinkedlist(adding head).
    public void addfirst(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head.prev = newnode;
        head = newnode;

    }

    // Adding element at the last of the Doublylinkedlist.
    public void addLast(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newnode;
        newnode.prev = current;
    }

    // traversing amd printing the doublylinkedlist.
    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <=> ");
            current = current.next;
        }
        System.out.print("null");
        System.out.println("");
    }

    // removing the first element from the doubly linkedlist
    public void removefirst() {
        if (head == null) {
            System.out.println("Stack is Empty");
        }
        head = head.next;
        System.out.println("");
    }

    // removing the last element form the doubly linkedlist

    /*
     * public void removelast() {
     * Node current1 = head.next;
     * Node current2 = head;
     * 
     * while (current1.next != null) {
     * current1 = current1.next;
     * current2 = current2.next;
     * }
     * 
     * current2.next = null;
     * }
     */

    public void removelast() {
        Node current1 = head;
        Node current2 = head;

        while (current1.next != null) {
            current1 = current1.next;
        }
        while (current2.next != current1) {
            current2 = current2.next;
        }
        current2.next = null;
    }

    // Main Class
    public static void main(String[] args) {
        DoublyLinkedList d = new DoublyLinkedList();
        d.addfirst(5);
        d.addfirst(6);
        d.addfirst(7);
        d.addfirst(9);
        d.print();
        d.addLast(2);
        d.print();
        d.removefirst();
        d.print();
        d.removelast();
        d.print();
    }
}