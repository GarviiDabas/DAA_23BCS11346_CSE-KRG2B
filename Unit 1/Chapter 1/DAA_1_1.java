class Stack {
    private int[] arr;
    private int top;
    private int size;

    // Constructor
    public Stack(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    // Check if empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if full
    public boolean isFull() {
        return top == size - 1;
    }

    // Push element
    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is full!");
        } else {
            arr[++top] = data;
            System.out.println(data + " pushed");
        }
    }

    // Pop element
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1; // return dummy value
        }
        return arr[top--];
    }

    // Peek (top element)
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return arr[top];
    }

    // Display all elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.print("Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// Main class
public class DAA_1_1 {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        stack.display();
    }
}
