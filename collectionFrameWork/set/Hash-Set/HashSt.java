import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSt {

    public static void main(String[] args) {

        // HashSet follows the Set property.
        // It does not allow duplicate values.
        // HashSet does not maintain any particular order.
        // Think of it like a bag: unique elements, no guaranteed order.

        Set<Integer> set = new HashSet<>(); // O(1)
        // Set<Integer> set = new LinkedHashSetHashSet<>();
        // all methods remains same but it follows/maintains order.
        // Set<Integer> set = new LinkedHashSet<>();
        // all methods remains same but it follows/maintains order.
        // Set<Integer> set = new TreeSet<>(); O(logn)
        // all methods remains same but it store element in sorted order.

        // -------------------- ADD --------------------

        set.add(5); // Adds 5 to the set.
        set.add(6); // Adds 6 to the set.
        set.add(60); // Adds 60 to the set.
        set.add(5); // Duplicate 5 is ignored.

        System.out.println(set); // Prints all elements of the set.

        // -------------------- REMOVE --------------------

        set.remove(60); // Removes 60 from the set.

        // -------------------- SEARCH --------------------

        System.out.println(set.contains(6)); // Checks if 6 is present; returns true or false.

        // -------------------- CHECK EMPTY --------------------

        System.out.println(set.isEmpty()); // Checks if the set is empty; returns true or false.

        // -------------------- SIZE --------------------

        System.out.println(set.size()); // Returns the number of elements in the set.

        // -------------------- ADD ALL --------------------

        Set<Integer> newSet = new HashSet<>();

        newSet.add(10);
        newSet.add(20);

        set.addAll(newSet); // Adds all elements of newSet into set.

        System.out.println(set);

        // -------------------- REMOVE ALL --------------------

        set.removeAll(newSet); // Removes all elements of newSet from set.

        System.out.println(set);

        // -------------------- CLEAR --------------------

        set.clear(); // Removes all elements from the set.

        System.out.println(set.size()); // Returns 0 because the set is empty.
    }
}
