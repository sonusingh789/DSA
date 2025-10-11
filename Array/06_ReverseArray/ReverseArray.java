
public class ReverseArray {
  
 
    public static void getReverseInSingleArray() {
        int arr[]={1,2,3,4,5,6};
        
        int start = 0;
        int end =arr.length-1;
        
        int i = start;
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        
        for(int j = 0 ; j<arr.length;j++){
            System.out.print(arr[j]  + " ");
        }
        
    }




  public static int[] getReverseArray(int arr[]) {
    int storeArr[] = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      storeArr[i] = arr[arr.length - i - 1];
    }

    return storeArr;
  }

  public static void main(String[] args) {
    int[] arr = { 2, 3, 4, 5, 6 };

    int[] reverseArr = getReverseArray(arr);

    System.out.print("[");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(reverseArr[i]);
      if (i < arr.length - 1) {
        System.out.print("|");
      }

    }
    System.out.print("]");

  }
}

