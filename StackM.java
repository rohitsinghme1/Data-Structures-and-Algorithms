import java.util.*;

public class StackM {

    int capacity;
    int top;
    int arr[];
    Scanner sc = new Scanner(System.in);

    public StackM(int Size) {
        arr = new int[Size];
        capacity = Size;
        top = -1;
    }

    public boolean IsEmpty() {
        if (top == -1) {
            return true;
        }
        return false;
    }

    public boolean IsFull() {
        if (top == capacity - 1) {
            return true;
        }
        return false;
    }

    public void menu() {
        System.out.println("1. push");
        System.out.println("2. pop");
        System.out.println("3. peek");
        System.out.println("4. print stack");
        System.out.println("");

        int cho;
        cho = sc.nextInt();
        System.out.println("");

        switch (cho) {

            case 1:
                if (IsFull()) {
                    System.out.println("Stack is full");
                    return;
                }

                System.out.println("Enter the value to push");
                int a = sc.nextInt();
                arr[++top] = a;
                System.out.println("added");
                System.out.println("");

                break;

            case 2:
                if (IsEmpty()) {
                    System.out.println("Stack is Empty");
                    return;
                }
                top--;
                System.out.println("popped");
                System.out.println("");

                break;

            case 3:
                if (IsEmpty()) {
                    System.out.println("Stack is Empty");
                    return;
                }
                System.out.println(arr[top]);
                System.out.println("");

                break;

            case 4:
                if (IsEmpty()) {
                    System.out.println("Stack is Empty");
                    return;
                }
                for (int i = top; i >= 0; i--) {
                    System.out.println(arr[i]);
                }
                System.out.println("");

                break;

            default:
                System.out.println("Choose the Correct Option");
                System.out.println("");
        }
        menu();

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ss;
        System.out.println("Enter the Size of Stack");
        ss = scan.nextInt();
        StackM s = new StackM(ss);
        s.menu();
        scan.close();
    }
}
