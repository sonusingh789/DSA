public class SelectionSort {

    static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min_indx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_indx]) {
                    min_indx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_indx];
            arr[min_indx] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 9, 3, 8, 5, 6, 7, 8, 9 };

        int[] result = selectionSort(arr);

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}