public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(20);
        queue.enqueue(25);
        //queue.enqueue(30);
        //queue.enqueue(35);

        System.out.println("\nQueue Elements");
        queue.show();

        System.out.println("\n\nDeleted Element : " + queue.dequeue());
        System.out.println("Deleted Element : " + queue.dequeue());
        System.out.println("Deleted Element : " + queue.dequeue());
        System.out.println("Deleted Element : " + queue.dequeue());
        System.out.println("Deleted Element : " + queue.dequeue());
        System.out.println("Deleted Element : " + queue.dequeue());

        System.out.println("\n\nQueue total elements : " + queue.elements);
        System.out.println("Queue is Empty : " + queue.isEmpty());
        System.out.println("Queue is Full : " + queue.isFull());

        System.out.println("\n\nFront current value : " + queue.front);
        System.out.println("Front rear value : " + queue.rear);

        
    }
} 