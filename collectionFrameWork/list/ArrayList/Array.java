import java.util.ArrayList;
import java.util.Stack;
import java.util.Iterator;

public class Array {

    public static void main(String[] args) {

        // Normal array [] drawback: their size is not dynamic.

        // ArrayList<Wrapper class type> objectName = new ArrayList<>();

        // ArrayList<Byte>
        // ArrayList<Short>
        // ArrayList<Integer>
        // ArrayList<Long>
        // ArrayList<Float>
        // ArrayList<Double>
        // ArrayList<Character>
        // ArrayList<Boolean>
        // ArrayList<String>
        //
        // Except String, all are wrapper classes.
        // String itself is a class, so it does not need a wrapper class.

        // ---------------------------------------------------------
        // A R R A Y L I S T
        // ---------------------------------------------------------

        ArrayList<Integer> list = new ArrayList<>();

        // METHODS

        // To add elements into an ArrayList.
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("Original list: " + list);

        // To find size of list:
        // list.size()
        //
        // In array:
        // array.length
        //
        // For String:
        // string.length()

        System.out.println("Size: " + list.size());

        // FOR EACH LOOP - mostly used

        System.out.print("For-each: ");

        for (Integer element : list) {
            System.out.print(element + " ");
        }

        System.out.println();

        // Iterator

        Iterator<Integer> it = list.iterator();

        System.out.print("Iterator: ");

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();

        // ---------------------------------------------------------
        // To add complete another list to a new list
        // ---------------------------------------------------------

        ArrayList<Integer> newList = new ArrayList<>();

        newList.addAll(list);

        System.out.println("New list after addAll: " + newList);

        // ---------------------------------------------------------
        // To add element at a specific index
        // newList.add(index, element)
        // O(n)
        // ---------------------------------------------------------

        newList.add(0, 5);

        System.out.println("After adding 5 at index 0: " + newList);

        // ---------------------------------------------------------
        // To get element from an ArrayList
        // newList.get(index)
        // ---------------------------------------------------------

        System.out.println("Element at index 0: " + newList.get(0));

        // ---------------------------------------------------------
        // To remove element from an ArrayList
        // remove(index)
        // O(n)
        // ---------------------------------------------------------

        newList.remove(1);

        System.out.println("After removing index 1: " + newList);

        // ---------------------------------------------------------
        // To remove a specific value from ArrayList
        // ---------------------------------------------------------

        newList.remove(Integer.valueOf(30));

        System.out.println("After removing value 30: " + newList);

        // ---------------------------------------------------------
        // To clear/remove entire ArrayList
        // ---------------------------------------------------------

        // list.clear();

        // ---------------------------------------------------------
        // To update value at a specific index
        // ---------------------------------------------------------

        list.set(2, 1000);

        System.out.println("After updating index 2: " + list);

        // ---------------------------------------------------------
        // To check whether an item is present or absent
        // Returns true / false
        // ---------------------------------------------------------

        System.out.println("Does list contain 30? " + list.contains(30));

    }
}
