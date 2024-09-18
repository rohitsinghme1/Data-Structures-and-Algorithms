//Implementation of queue using linklist
//By - Rohit Singh

class QueusLL {

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

    // for adding an element into the queue
    public void add(int data) {
        Node newnode = new Node(data);

        if (head == null) {
            head = tail = newnode;
        } else {
            tail.next = newnode;
            tail = newnode;
        }
    }

    // For removing element from the queue;
    public void remove() {

        if (head == null) {
            System.out.println("Queue is Empty");
            return;
        }
        if (head == null) {
            head = tail = null;
        }

        head = head.next;
    }

// for printing the linklist
    public void printLL() {
        if (head == null) {
            System.out.println("Queue is Empty");
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

// main method
    public static void main(String agrs[]) {

        QueusLL que = new QueusLL();
        que.add(5);
        que.printLL();
        que.add(4);
        que.add(6);
        que.printLL();
        que.remove();
        que.printLL();
    }
}
