import vithu.Stack;

public class Main {
    public static void main(String[] args) {
        int[] my_Stack = new int[5];

        Stack stack = new Stack();

        stack.push(my_Stack, 2);
        stack.push(my_Stack, 4);
        stack.push(my_Stack, 6);
        stack.push(my_Stack, 8);
        stack.push(my_Stack, 10);

        for (int i = 0; i < my_Stack.length; i++) {
            System.out.println(my_Stack[i]);
        }

        System.out.println("*******************");

        /*stack.pop(my_Stack);
        stack.pop(my_Stack);
        stack.pop(my_Stack);

        for (int i = 0; i < my_Stack.length; i++) {
            System.out.println(my_Stack[i]);
        }*/
    }
}