import java.util.*;

public class FloorNumber {
    static int floor(int[] arr, int target){
        int start=0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (arr[mid]==target){
                return arr[mid];
            }
            if (arr[mid]>target){
                end = mid-1;
            }else{
                start=mid+1;
            }
        }

        return arr[end];
    }
    public static void main (String args[]){
         
        
    }
    
}
