import com.vithu.Queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();

        //adding elements
        queue.insert(5);
        queue.insert(10);
        queue.insert(15);
        queue.insert(20);
        queue.insert(25);
        queue.insert(255);
        queue.insert(251);
        queue.insert(325);
        queue.insert(525);
        queue.insert(625);
        queue.insert(725);

        //delete the queue elements
        System.out.println("pop : " + queue.pop());
        System.out.println("pop : " + queue.pop());
        System.out.println("pop : " + queue.pop());
        System.out.println("pop : " + queue.pop());
        System.out.println("pop : " + queue.pop());
        System.out.println("pop : " + queue.pop());
        System.out.println("pop : " + queue.pop());
        System.out.println("pop : " + queue.pop());
        System.out.println("pop : " + queue.pop());
        System.out.println("pop : " + queue.pop());
        System.out.println("pop : " + queue.pop());
        System.out.println("pop : " + queue.pop());
  

        //Check Empty
        System.out.println("is Empty : " + queue.isEmpty());

        //Check queue is full
        System.out.println("is Full : " + queue.isFull());

        //display the queue elements
        queue.show();
    }
}