public class SingleLinkedList {
    private Node head;

    public SingleLinkedList() {
        this.head = null;
    }

    //Inserting at the beginning
    public void insertFront(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
    }

    // Method to print the linked list 
    public void printList() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
    }

    // Method to remove the front node
    public int removefront() {
        int value = 0;
        if (head == null) {
            System.out.println("Linked List is empty. Nothing to remove.");
        }
        else {
            value = head.data;
            head = head.next;
        }

        return value;
    }

    // Method to insert a node at the end
    public void insertLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        }
        else {
            Node current = head;

            while (current != null) {
                current = current.next;
            }

            current.next = newNode;
        }
    }

    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();

        list.insertFront(10);
        list.insertFront(20);

        list.printList();
        System.out.println("\nHead value : " + list.head.data);

        System.out.println("\nRemove front : " + list.removefront());

        System.out.println("\nHead value : " + list.head.data);
    }
}
