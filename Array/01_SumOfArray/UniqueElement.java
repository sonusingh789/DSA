import java.util.*;
class UniqueElement {
    static int unique(){
        int[] data = {2,5,4};
        ArrayList <Integer> arr = new ArrayList<>();
        int totalUnique=0;
        for (int i = 0 ; i<data.length;i++){
            int start = data[i];
            int freq=0;
            
            for(int j = 0 ; j<data.length;j++){
                if(start == data[j]){
                    freq++;
                }
            }
            if(freq==1){
                arr.add(data[i]);
                totalUnique++;
            }
        }
        
        return totalUnique;
        
    }
    
    public static void main(String[] args) {
       System.out.println("Total Unique Element : "+unique()); 
    }
}