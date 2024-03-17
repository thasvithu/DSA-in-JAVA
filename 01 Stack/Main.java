import com.vithu.Stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        
        //Adding value into stack
        stack.push(5); //first element
        stack.push(10);
        stack.push(15);
        stack.push(20);
        stack.push(25); //last element
        

        //View the stack values
        stack.show();

        //check stack is empty
        System.out.println("Check Empty : " + stack.isEmpty());

        //pop the stack
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        

        //View the stack values after pop
        stack.show();


        // Check stacj is full
        
        System.out.println("Stack Full : " + stack.isFull());
    }
}