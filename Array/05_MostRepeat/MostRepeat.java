
public class MostRepeat {
  public static void main(String[] args){
    int arr[]={2,4,6,7,8,8,8,8,8};
       int data = 8;
      System.out.println(" The Data " + data + "  repeated for " + getMostRepeat(arr,data) + " Times");


     }

  public static int getMostRepeat(int arr[],int data){
      int count=0;

      for(int i = 0 ; i<arr.length;i++){
        if(arr[i]==data){
          count++;
        }

      }


       return count;
     }

}
