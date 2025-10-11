import java.util.Scanner;

public class SumOfArray {


  public static int getSum(int []arr){
    int sum=0;
    for(int i=0;i<arr.length;i++){
    sum +=arr[i];
    
    }

    return sum;
  }
  public static void main(String[] args){
    
    System.out.print("Enter the size of an Array ! : ");
    Scanner input = new Scanner(System.in);
    int size = input.nextInt();
    int [] arr = new int[size];

    for(int i = 0 ; i<arr.length;i++){
      System.out.print("Enter [" + (i+1) +"] Element : ");
      arr[i]=input.nextInt();
    }
    
    System.out.print("Sum of all Element in an Array is : " + getSum(arr));
    

  }
  
}
