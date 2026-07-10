import java.util.*;

public class CyclicSort {
    static int[] sort(int[] arr){
        int i=0;
        while (i<(arr.length)){
            int CorrectIndex = arr[i]-1;

            if (arr[CorrectIndex]!=arr[i]){
                int temp = arr[i];
                arr[i]=arr[CorrectIndex];
                arr[CorrectIndex]=temp;

            }else{
                i++;
            }

        }
        return arr;
    } 
    public static void main(String args[]){
        int[] arr = {3,4,1,2,5};
        System.out.println(Arrays.toString(sort(arr)));

    }
    
}
