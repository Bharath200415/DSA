import java.util.*;

public class Sorted2D {
    static int[] binarySearch(int[][] arr, int target, int row, int cStart, int cEnd){
        while (cStart<=cEnd){
            int mid = cStart+(cEnd-cStart)/2;

            if (arr[row][mid]==target){
                return new int[]{row,mid};
            }
            if (arr[row][mid]>target){
                cEnd = mid-1;
            }else{
                cStart=mid+1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] search(int[][] arr,int target){
        int rows= arr.length;
        int cols = arr[0].length-1;

        //edge case
        if (rows==1){
            return binarySearch(arr, target, 0, 0, cols);
        }

        //get the middle column: run the loop until only 2 rows remain
        int rStart=0;
        int rEnd = rows-1;
        int cMid=(cols+1)/2;
 
        while (rStart<(rEnd-1)){
            int mid=rStart+(rEnd-rStart)/2;
            if (arr[mid][cMid]==target){
                return new int[]{mid,cMid};
            }
            if (arr[mid][cMid]<target){
                rStart=mid;
            }else{
                rEnd=mid;
            }
        }

        //now we have two rows remaining after the above while loop
        //check whether the target is in middle col
        if (arr[rStart][cMid]==target){
            return new int[]{rStart, cMid};
        }

        if (arr[rStart+1][cMid]==target){
            return new int[]{rStart+1,cMid};
        }

        //search in first quadrant
        if (arr[rStart][cMid-1]>=target){
            return binarySearch(arr, target, rStart, 0, cMid-1);
        }
        //search in 2nd quad
        if (arr[rStart][cMid+1]<=target && target<=arr[rStart][cols]){
            return binarySearch(arr, target, rStart, cMid+1, cols);
        }
        //search in 3rd quad
        if (arr[rStart+1][cMid-1]>=target){
            return binarySearch(arr, target, rStart+1, 0, cMid-1);

        }else{
            return binarySearch(arr, target, rStart+1, cMid+1, cols);
        }

    }
    public static void main (String args[]){
        int[][] arr={
            {1},
            {2},
            {4},
            {7}
        };

       System.out.println(Arrays.toString(search(arr,4))); 
    }
}
