import java.util.*;

//Problem statement: Return the target element or ceiling of a number from a sorted array given a target element

public class CeilingNumber {
    static int ceiling(int[] arr, int target){
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

        return arr[start];
    }
    public static void main (String args[]){
        int[] arr={2,3,5,9,14,16,18};
        System.out.println(ceiling(arr,15));

    }
}
