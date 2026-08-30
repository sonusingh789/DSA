import java.util.*;

public class ArrayDqe {

    public static void main(String[] args) {

        // A Deque is a double-ended queue where insertion and deletion can happen at
        // both ends.
        // ArrayDeque is commonly useful in problems like Sliding Window.
        // we can use it for stack as well just use pollLast and offer.
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        // -------------------- ADD / INSERT --------------------

        adq.offer(5); // Adds 5 at the last (rear) of the deque.
        adq.offerFirst(5); // Adds 5 at the first (front) of the deque.
        adq.offerLast(8); // Adds 8 at the last (rear) of the deque.

        // -------------------- PEEK / VIEW --------------------

        adq.peek(); // Returns the first element without removing it.
        adq.peekFirst(); // Returns the first element without removing it.
        adq.peekLast(); // Returns the last element without removing it.

        // -------------------- REMOVE / DELETE --------------------

        adq.poll(); // Removes and returns the first element.
        adq.pollFirst(); // Removes and returns the first element.
        adq.pollLast(); // Removes and returns the last element.
    }
}
