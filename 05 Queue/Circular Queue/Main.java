public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(20);
        queue.enqueue(25);
        //queue.enqueue(35);

        queue.show();

        System.out.println("\n\nDeleted Element : " + queue.dequeue());
        System.out.println("Deleted Element : " + queue.dequeue());
        
        queue.enqueue(30);

        queue.show();

        System.out.println("\n\nQueue total elements : " + queue.size);
        System.out.println("Queue is Empty : " + queue.isEmpty());
        System.out.println("Queue is Full : " + queue.isFull());

        System.out.println("\n\nCurrent front value : " + queue.front);
        System.out.println("Current rear value : " + queue.rear);

        for (int i : queue.queue) {
            System.out.print(i + " ");
        }
    }
} 