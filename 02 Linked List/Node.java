public class Node {
    int data;   // This is the data that the Node object holds
    Node next;  // This is a reference to the next Node object  

    // Constructor  
    public Node(int data) {
        this.data = data; // Set the data of the Node object to the data passed in
        this.next = null; // Set the next Node object to null 
    }
}
