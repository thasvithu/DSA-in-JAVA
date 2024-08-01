public class Main {
    private static Node head; // Head of the linked list

    public Main() {
        this.head = null;
    }

    // Method to insert a node at the beginning
    public static void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public static void main(String[] args) {
        Node node1 = new Node(10); // Create a new Node object with data 1
        Node node2 = new Node(20); // Create a new Node object with data 2
        Node node3 = new Node(30); // Create a new Node object with data 3

        node1.next = node2; // Set the next Node object of node1 to node2
        node2.next = node3; // Set the next Node object of node2 to node3

        // Print the data of each Node object
        //System.out.println(node1.data); // 10
        //System.out.println(node1.next.data); // 20
        //System.out.println(node1.next.next.data); // 30

        insertAtBeginning(5);
        insertAtBeginning(5);
        insertAtBeginning(5);
        insertAtBeginning(5);
        insertAtBeginning(54);
        
        // print the data of each node objects by looping
        Node current = head;   
        while (current != null) {
            System.out.println(current.data);
            //System.out.println(current.next);
            current = current.next;
        }

       
    }
}
