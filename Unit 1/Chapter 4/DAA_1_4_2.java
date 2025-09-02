// Node class for Circular Linked List
class CircularNode {
    int data;
    CircularNode next;

    CircularNode(int data) {
        this.data = data;
        next = null;
    }
}

// Circular Linked List class
class CircularLinkedList {
    CircularNode tail; // tail points to last node

    // Insert at beginning
    void insertAtBeginning(int data) {
        CircularNode newNode = new CircularNode(data);
        if (tail == null) {
            tail = newNode;
            tail.next = tail; // circular
            return;
        }
        newNode.next = tail.next; // newNode -> head
        tail.next = newNode;      // tail -> new head
    }

    // Insert at end
    void insertAtEnd(int data) {
        CircularNode newNode = new CircularNode(data);
        if (tail == null) {
            tail = newNode;
            tail.next = tail;
            return;
        }
        newNode.next = tail.next; // newNode points to head
        tail.next = newNode;      // tail points to newNode
        tail = newNode;           // update tail
    }

    // Delete from beginning
    void deleteFromBeginning() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }
        CircularNode head = tail.next;
        if (head == tail) { // only one node
            System.out.println("Deleted: " + head.data);
            tail = null;
            return;
        }
        System.out.println("Deleted: " + head.data);
        tail.next = head.next; // remove first node
    }

    // Delete from end
    void deleteFromEnd() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }
        CircularNode head = tail.next;
        if (head == tail) { // only one node
            System.out.println("Deleted: " + head.data);
            tail = null;
            return;
        }
        CircularNode temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        System.out.println("Deleted: " + tail.data);
        temp.next = tail.next; // bypass last node
        tail = temp;           // update tail
    }

    // Display the list
    void display() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }
        CircularNode temp = tail.next; // head
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != tail.next);
        System.out.println("(back to head)");
    }
}

// Main class for Circular Linked List
public class DAA_1_4_2 {
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();

        cll.insertAtBeginning(10);
        cll.insertAtEnd(20);
        cll.insertAtBeginning(5);
        cll.display();

        cll.deleteFromBeginning();
        cll.deleteFromEnd();
        cll.display();
    }
}
