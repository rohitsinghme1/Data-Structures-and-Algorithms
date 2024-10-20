import java.util.*;

class stack2 {

    private int top;
    private int[] arr;
    private int capacity;
    Scanner sc = new Scanner(System.in);

    public stack2(int Size) {
        arr = new int[Size];
        capacity = Size;
        top = -1;
    }

    public Boolean IsEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean IsFull() {
        if (top == capacity - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(int a) {
        if (IsFull()) {
            System.out.println("Stack is full");
            return;
        }
        arr[++top] = a;
    }

    public void pop() {
        if (IsEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        int pos = arr[top--];
    }

    public void peek() {
        if (IsEmpty()) {
            System.out.println("stack is empty");
            return;
        }
        System.out.println("the top element is: " + arr[top]);
    }

    public static void main(String args[]) {
        stack2 s = new stack2(5);
        s.push(6);
        s.peek();
        s.pop();
        s.peek();

    }
}