public class Queue {
    int front;
    int rear;
    int elements;
    int[] queue;
    int maxSize;

    // Constructor
    Queue(int size) {
        queue = new int[size];
        front = -1;
        rear = -1;
        elements = 0;
        maxSize = size;
    }

    //check queue is empty
    public boolean isEmpty() {
        return front == -1 || front > rear;
    }

    //check queue is full
    public boolean isFull() {
        return front == 0 && rear == maxSize - 1;
    }

    //inserting elements
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full!");
        }
        else {
            if (front == -1) {
                front = 0;
            }

            queue[++rear] = value;
            elements ++;
        }
    }

    //delete queue elements
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return -1;
        }
        else {
            int data = queue[front];

            if (front > rear) {
                front = -1;
                rear = -1;
            }

            front ++;
            elements --;
            return data;
        }
    }

    //see the front element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        else {
            return queue[front];
        }
    }

    //display queue elements
    public void show() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        }
        else {
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
        }
    }

    
}
