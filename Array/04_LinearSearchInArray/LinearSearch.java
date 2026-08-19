public class LinearSearch {

  public static void main(String[] args) {
    int arr[] = { 2, 5, 6, 7, 8, 9 };
    int data = 6;
    int index = getSearch(arr, data);

    if (index == -1) {
      System.out.print(" The Element not found in the Array !");
    } else {
      System.out.print(" The Element is found at index : " + index);
    }

  }

  public static int getSearch(int arr[], int data) {
    int i = 0;
    while (i < arr.length) {
      if (arr[i] == data) {
        return i;
      }
      i++;
    }
    return -1;
  }

}