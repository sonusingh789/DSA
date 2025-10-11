
public class minMaxArray {

  public static int[] minMax(int[] arr){
    int [] store = new int[2];
    int min = arr[0];
    int max= arr[0];

    for(int i = 1 ; i<arr.length ; i++ ){
      if (arr[i]<min){
        min=arr[i];
      }
    }
    for(int i = 1 ; i<arr.length ; i++ ){
      if (arr[i]>max){
        max=arr[i];
      }
    }

    store[0]=min;
    store[1]=max;

    return store;
  }

  public static void main(String[] args){
    
    int arr[]={2,3,4,5,6,7,8};
    int[] show = minMax(arr);

    System.out.println("Minimum Value is : " + show[0]);
    System.out.println("Maximum Value is : " + show[1]);
  }
}
