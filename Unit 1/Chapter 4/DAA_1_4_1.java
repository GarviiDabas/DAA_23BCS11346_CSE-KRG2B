// Node class for Doubly Linked List
class DoublyNode {
    int data;
    DoublyNode prev, next;

    DoublyNode(int data) {
        this.data = data;
        prev = next = null;
    }
}

// Doubly Linked List class
class DoublyLinkedList {
    DoublyNode head;

    // Insert at beginning
    void insertAtBeginning(int data) {
        DoublyNode newNode = new DoublyNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Insert at end
    void insertAtEnd(int data) {
        DoublyNode newNode = new DoublyNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        DoublyNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    // Delete from beginning
    void deleteFromBeginning() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Deleted: " + head.data);
        head = head.next;
        if (head != null) head.prev = null;
    }

    // Delete from end
    void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        DoublyNode temp = head;
        if (temp.next == null) { // only one node
            System.out.println("Deleted: " + temp.data);
            head = null;
            return;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        System.out.println("Deleted: " + temp.data);
        temp.prev.next = null;
    }

    // Display the list
    void display() {
        DoublyNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

// Main class for Doubly Linked List
public class DAA_1_4_1 {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertAtBeginning(10);
        dll.insertAtEnd(20);
        dll.insertAtBeginning(5);
        dll.display();

        dll.deleteFromBeginning();
        dll.deleteFromEnd();
        dll.display();
    }
}
