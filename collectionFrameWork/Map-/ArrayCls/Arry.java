import java.util.Arrays;

public class Arry {
    public static void main(String[] args) {
        // it is array class is used for premitives arr[] manupulations.

        // binary Searching
        // int[] arr = { 1, 6, 3, 4, 5, 8, 9 };
        // int index = Arrays.binarySearch(arr, 9);
        // System.out.println(index);

        // sorting
        int[] arr = { 1, 6, 3, 4, 5, 8, 9 };
        Arrays.sort(arr);

        for (int x : arr) {
            System.out.println(x);
        }

    }
}
