
public class AverageOfArray {

  public static int getAverage(int arr[]) {

    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }

    int average = (sum / arr.length);

    return average;

  }

  public static void main(String[] args) {

    int[] arr = { 2, 3, 4, 5, 6 };

    System.out.print("The Average of an Array is : " + getAverage(arr));

  }

}
