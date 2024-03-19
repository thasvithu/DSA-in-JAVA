package com.vithu;

public class Queue {
    int[] queueArray = new int[20];
    int front = 0;
    int rear = -1;
    int size = queueArray.length;
    
    //Inserting Elements
    public void insert(int value) {
        if (isFull()) {
            System.out.println("Queue is Full!");
        }
        else {
            rear = rear + 1;
            queueArray[rear] = value;
        }
    }

    //delete queue elelemnts
    public int pop() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");

            return -1;
        }
        else {
            int data = queueArray[front];

            for (int i = 0; i < rear; i++) {
                queueArray[i] = queueArray[i + 1];
            }

            rear = rear - 1;

            return data;
        }
    }

    //display the queue elements
    public void show() {
        for (int i = front; i <= rear; i++) {
            System.out.print(queueArray[i] + " ");
        }
    }

    //check empty
    public boolean isEmpty() {
        return rear == -1;
    }

    //Check queue is full
    public boolean isFull() {
        return rear == size - 1;
    }
}