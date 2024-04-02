import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.push("A");
        list.push("B");
        list.push("C");
        list.push("D");

        list.pop();
        list.poll();

        list.offerFirst("FA");

        System.out.println(list);
    }
}