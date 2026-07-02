import java.util.*;

public class TwoDArraySearch{
    static int[] search(int[][] arr, int target){
        int row=0;
        int col= arr[0].length-1;

        while (row<arr.length && col>=0){
            if (arr[row][col]==target){
                return new int[]{row,col};
            }

            if (arr[row][col]<target){
                row=row+1;
            }else{
                col--;
            }
        }


        return new int[]{-1,-1};
    }
    public static void main (String args[]){
        int[][] arr= {
            {10,20,30,40},
            {13,25,35,45},
            {29,30,37,49},
            {33,34,39,52}
        };

        System.out.println(Arrays.toString(search(arr,39)));

    }
}