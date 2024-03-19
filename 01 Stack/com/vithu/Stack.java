package com.vithu;

public class Stack {
    int[] stackArray = new int[5];
    int top = -1; //default value -1
    int size = stackArray.length;

    // Inserting elements
    public void push(int value) {
        //System.out.println("Top Value is : " + top); //check the top value
        if (isFull()) {
            System.out.println("Stack is full!");
        }
        else {
            top = top + 1;
            stackArray[top] = value;
        }
    }

    // Display elements
    public void show() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        }
        else {
            for (int i = top; i >= 0; i--) {
                System.out.println(stackArray[i]);
            }
        }
    }

    // Check Stack Empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Delete stack element
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        else {
            int data = stackArray[top];
            top = top - 1;
            return data;
        }
    }

    //check Stack is full
    public boolean isFull() {
        return top == size - 1;
    }

    //View the current element in the top
    int peek() {
        return stackArray[top];
    }
}