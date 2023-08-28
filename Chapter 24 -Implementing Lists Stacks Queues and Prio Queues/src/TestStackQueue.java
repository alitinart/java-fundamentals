import queuestack.GenericQueue;
import queuestack.GenericStack;

public class TestStackQueue {
    public static void main(String[] args) {
        // Create a stack
        GenericStack<String> stack = new GenericStack<>();

        // Add elements to the stack
        stack.push("Tom");
        System.out.println("(1) " + stack);

        stack.push("Susan");
        System.out.println("(2) " + stack);

        stack.push("Kim");
        stack.push("Michael");
        System.out.println("(3) " + stack);

        // Remove elements from the stack
        System.out.println("(4) " + stack.pop());
        System.out.println("(5) " + stack.pop());
        System.out.println("(6) " + stack);

        // Create a queue
        GenericQueue<String> queue = new GenericQueue<>();

        // Add elements to the queue
        queue.enqueue("Tom");
        System.out.println("(7) " + queue);

        queue.enqueue("Susan");
        System.out.println("(8) " + queue);

        queue.enqueue("Kim");
        queue.enqueue("Michael");
        System.out.println("(9) " + queue);

        // Remove elements from the queue
        System.out.println("(10) " + queue.dequeue());
        System.out.println("(11) " + queue.dequeue());
        System.out.println("(12) " + queue);
    }
}
