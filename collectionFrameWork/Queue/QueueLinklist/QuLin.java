import java.util.LinkedList;
import java.util.Queue;

public class QuLin {

    public static void main(String[] args) {

        // LinkedList implements the Queue interface.
        // Queue follows FIFO: First In, First Out.

        Queue<Integer> queue = new LinkedList<>();

        // -------------------- ADD ELEMENTS --------------------

        queue.offer(1); // Adds 1 to the rear of the queue.
        queue.offer(24); // Adds 24 to the rear of the queue.
        queue.offer(67); // Adds 67 to the rear of the queue.

        // Queue: 1 → 24 → 67
        // ↑
        // FRONT

        // -------------------- REMOVE ELEMENT --------------------

        queue.poll();
        // Removes and returns the front element (1).
        // FIFO: First element added is the first element removed.

        // -------------------- PEEK --------------------

        System.out.println(queue.peek());
        // Returns the front element without removing it.

        // -------------------- PRINT QUEUE --------------------

        System.out.println(queue);
        // Prints the remaining elements in the queue.
    }
}
