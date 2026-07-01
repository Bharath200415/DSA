import java.util.*;

public class OrderAgnostic{
    static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            int mid = start+(end-start)/2;

            if (arr[mid]==target){
                return mid;
            }

            if (arr[mid]>target){
                start=mid+1;
            }else{
                end = mid-1;
            }
            
        }
        return -1;

    }
    public static void main(String args[]){
        int[] arr = {98,86,73,64,43,21};
        System.out.println(search(arr,86));
    }
}