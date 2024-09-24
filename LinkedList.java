class LinkedList {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Adding Node in the Start of the linked list(adding head).
    public void AddFirst(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    // Adding element at the last of the linkedlist.
    public void AddLast(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newnode;
    }

    // removing node form the first(removing head).
    public void removefirst() {
        if (head == null) {
            System.out.println("List is Empty");
        }
        if (head.next == null) {
            head = null;
            return;
        }
        head = head.next;
    }

    // removing the last node.
    public void removelast() {
        if (head == null) {
            System.out.println("List is Empty");
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondlast = head;
        Node lastnode = head.next;
        while (lastnode.next != null) {
            lastnode = lastnode.next;
            secondlast = secondlast.next;
        }
        secondlast.next = null;
    }

    // traversing amd printing the linkedlist.
    public void print() {
        if (head == null) {
            System.out.println("list is Empty");
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.print("null");
        System.out.println("");

    }

    // main class
    public static void main(String agrs[]) {
        LinkedList list = new LinkedList();
        list.AddFirst(5);
        list.AddLast(4);
        list.AddLast(7);
        list.AddLast(9);
        list.print();
        list.removelast();
        list.print();
        list.removefirst();
        list.print();
    }
}