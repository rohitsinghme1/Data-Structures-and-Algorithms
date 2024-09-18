
//implementation of Stack Using LinkList
//By- Rohit Singh

class StackLL {

    Node top;

    class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Insearting an element in the stack;
    public void Insert(int data) {
        Node newnode = new Node(data);

        if (top == null) {
            top = newnode;
            return;
        }

        newnode.next = top;
        top = newnode;
    }

    // deleating an element from Stack
    public void Remove() {
        if (top == null) {
            System.out.println("Stack is Empty");
            return;
        }

        top = top.next;
    }

    // printing the Stack
    public void printstack() {

        if (top == null) {
            System.out.println("Stack is Empty");
        }
        Node current = top;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println("");

    }

    public static void main(String args[]) {
        StackLL stack = new StackLL();
        stack.Insert(1);
        stack.Insert(2);
        stack.Insert(3);
        stack.Insert(5);
        stack.printstack();
        stack.Remove();
        stack.printstack();
    }
}