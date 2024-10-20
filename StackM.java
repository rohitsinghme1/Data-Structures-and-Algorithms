import java.util.*;

public class StackM {

    int capacity; // The maximum size of the stack
    int top; // Tracks the top index of the stack
    int arr[]; // Array to hold the stack elements
    Scanner sc = new Scanner(System.in); // Scanner to take user input

    // Constructor to initialize the stack with a given size
    public StackM(int Size) {
        arr = new int[Size]; // Initialize the array with the given size
        capacity = Size; // Set the capacity of the stack
        top = -1; // Set top to -1 indicating the stack is empty
    }

    // Method to check if the stack is empty
    public boolean IsEmpty() {
        if (top == -1) { // If top is -1, the stack is empty
            return true;
        }
        return false;
    }

    // Method to check if the stack is full
    public boolean IsFull() {
        if (top == capacity - 1) { // If top equals the last index, the stack is full
            return true;
        }
        return false;
    }

    // Method to display the menu and handle stack operations
    public void menu() {
        // Display the options to the user
        System.out.println("1. push");
        System.out.println("2. pop");
        System.out.println("3. peek");
        System.out.println("4. print stack");
        System.out.println("");

        int cho; // Variable to store user's choice
        cho = sc.nextInt(); // Take user input for menu choice
        System.out.println("");

        // Switch-case to handle the user's choice
        switch (cho) {

            case 1:
                // Push operation
                if (IsFull()) { // Check if stack is full
                    System.out.println("Stack is full");
                    return; // Exit if stack is full
                }

                System.out.println("Enter the value to push"); // Prompt for value to push
                int a = sc.nextInt(); // Take input for the value
                arr[++top] = a; // Increment top and add the value to the stack
                System.out.println("added"); // Confirmation message
                System.out.println("");

                break;

            case 2:
                // Pop operation
                if (IsEmpty()) { // Check if stack is empty
                    System.out.println("Stack is Empty");
                    return; // Exit if stack is empty
                }
                top--; // Decrement top to remove the top element
                System.out.println("popped"); // Confirmation message
                System.out.println("");

                break;

            case 3:
                // Peek operation
                if (IsEmpty()) { // Check if stack is empty
                    System.out.println("Stack is Empty");
                    return; // Exit if stack is empty
                }
                System.out.println(arr[top]); // Display the top element of the stack
                System.out.println("");

                break;

            case 4:
                // Print stack operation
                if (IsEmpty()) { // Check if stack is empty
                    System.out.println("Stack is Empty");
                    return; // Exit if stack is empty
                }
                for (int i = top; i >= 0; i--) { // Loop from top to bottom of the stack
                    System.out.println(arr[i]); // Print each element in the stack
                }
                System.out.println("");

                break;

            default:
                // Handle invalid input
                System.out.println("Choose the Correct Option");
                System.out.println("");
        }
        menu(); // Recursively call the menu to show options again after an operation
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Scanner to take user input for stack size
        int ss; // Variable to store the stack size
        System.out.println("Enter the Size of Stack");
        ss = scan.nextInt(); // Take input for the stack size
        System.out.println("");
        StackM s = new StackM(ss); // Create a new StackM object with the given size
        s.menu(); // Call the menu to begin stack operations
        scan.close(); // Close the scanner to prevent resource leak
    }
}
