package com.vithu;

public class Stack {
    int[] stackArray = new int[5];
    int top = 0; //default value 0

    // Inserting elements
    public void push(int value) {
        //System.out.println("Top Value is : " + top); //check the top value
        if (top < stackArray.length) {
            stackArray[top] = value;
            top = top + 1;
        }
        else {
            System.out.println("Stack is full!");
        }
    }

    // Display elements
    public void show() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        }
        else {
            for (int i = top - 1; i >= 0; i--) {
                System.out.println(stackArray[i]);
            }
        }
    }

    // Check Stack Empty
    public boolean isEmpty() {
        return top == 0;
    }

    // Delete stack element
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        else {
            top = top - 1;
            stackArray[top] = 0;
            return stackArray[top];
        }
    }

    //check Stack is full
    public boolean isFull() {
        return top >= stackArray.length;
    }
}