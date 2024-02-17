package vithu;

public class Stack {
    int size = 0;

    public void push(int[] stack, int value) {
        if (size < stack.length)
            stack[size++] = value;
        else
            System.out.println("Stack is full");
    }
/*
    public int pop(int[] stack) {
        size = 1;
       if (stack.length > 0)
            return stack[stack.length - size] = 0;
        else
            return -1;
    }
*/
}