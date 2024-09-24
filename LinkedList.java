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

    public void AddFirst(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void AddLast(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current = newnode;
    }

    public void removefirst() {
        if (head == null) {
            System.out.println("List is Empty");
        }
        head.next = head;
    }

    public void removelast() {

    }

    public static void main(String agrs[]) {
        LinkedList list = new LinkedList();
    }
}