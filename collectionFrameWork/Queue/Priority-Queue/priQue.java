import java.util.*;

public class priQue {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();
        // priorityQueue implememts queuse so it has all queue features.
        // to add elements same funcion as queue.

        pq.offer(40);
        pq.offer(14);
        pq.offer(1);
        pq.offer(18);

        System.out.println(pq);
        // [1, 18, 14, 40] it gives priority to lowest value / implements min heap.

        // to remove elements it removed min value.
        // it can be used foe min heap calc.
        pq.poll();
        System.out.println(pq);

        // to get next element that we will be removed:
        pq.peek();

        // ------------- switching priority ---(min to high )------------------

        // we have to make a comparator in reverse order.

        // Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder);
        // now priprity will be given to max(value) heap.

    }
}