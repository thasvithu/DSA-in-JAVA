public class Queue {
    int front;
    int rear;
    int size;
    int[] queue;


    Queue(int capacity) {
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if the queue is full
    public boolean isFull() {
        return size == queue.length;
    }

    // Insert elements into the queue
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }

        rear = (rear + 1) % queue.length;
        queue[rear] = value;
        size++;
    }

    // Remove elements from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        int data = queue[front];
        front = (front + 1) % queue.length;
        size--;
        return data;
    }

    // Peek at the front element of the queue
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }

        return queue[front];
    }

    // Get the current size of the queue
    public int size() {
        return size;
    }

    // Display the elements of the queue
    public void show() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("\nQueue elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % queue.length] + " ");
        }
        System.out.println();
    }
}