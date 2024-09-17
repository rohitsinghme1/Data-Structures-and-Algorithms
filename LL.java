//Implementation of LinkList in JAVA
//By - Rohit Singh

class LL {

    Node head;
    Node tail;

    class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add element in starting of the link list.

    // if there is no head .
    public void addfirst(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
            return;
        }
        // if there is already a head in the link list.
        newnode.next = head;
        head = newnode;
    }

    // Adding element at last of the link list.

    public void addlast(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }

    // printing a Linklist.
    public void printlist() {

        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.print("null");
        System.out.println("");
    }

    // reomoving head of the linklist.
    public void removefirst() {

        if (head == null) {
            System.out.println("List is empty");
        }

        head = head.next;
    }

    // removing tail of the linklist.
    public void removelast() {

        Node current = head;

        while (current.next != tail) {
            current = current.next;
        }
        current.next = null;
        tail = current;
    }

    // Checking the Size of the Linklist.
    public int getlength() {
        int counter = 0;
        Node current = head;

        while (current != null) {
            counter++;
            current = current.next;
        }

        return counter;
    }

    public static void main(String args[]) {
        LL list = new LL();
        list.addfirst(5);
        list.addfirst(4);
        list.addlast(8);
        list.addlast(9);
        list.printlist();
        list.removefirst();
        list.printlist();
        list.removelast();
        list.printlist();
        System.out.println("Length of the list is " + list.getlength());

    }
}
