
public class SortAsc {
  public static int[] ascendingSort(int []arr){
    
    for(int i = 0 ; i<arr.length;i++){
      for(int j = 0; j<arr.length-i-1;j++){
        if(arr[j]>arr[j+1]){
          int temp = arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }
   return arr;
  }

  public static void main(String[] args){
    int arr [] ={2,4,3,6,5,1,7};
    arr = ascendingSort(arr);
    System.out.print("[");
    for(int i = 0 ;i<arr.length ;i++){
      System.out.print(arr[i]);
      if(i<arr.length-1){
        System.out.print(",");
      }
    }
     System.out.print("]");

  }
  
}
