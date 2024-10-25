import java.util.*;

class array {
    int[] data;
    int Size;
    int capacity;

    public array(int capacity) {
        this.capacity = capacity;
        this.data = new int[capacity];
        this.Size = 0;
    }

    public void insert(int element) {
        if (Size == capacity) {
            System.out.println("Array is Full");
        }
        data[Size] = element;
        Size++;
    }

    public void delete(int index) {
        if (index == 0 || index >= Size) {
            System.out.println("Invalid Input");
            return;
        }
        for (int i = index; i < Size - 1; i++) {
            data[i] = data[i + 1];
        }
        Size--;
    }

    public void print() {
        if (Size == 0) {
            System.out.println("Array is empty");
            return;
        }

        for (int i = 0; i <= Size - 1; i++) {
            System.out.println(data[i] + " ");
        }
    }

    public static void main(String[] args) {
        array a = new array(5);
        a.insert(5);
        a.insert(7);
        a.insert(6);
        a.insert(3);
        a.delete(4);
        a.print();
    }

}