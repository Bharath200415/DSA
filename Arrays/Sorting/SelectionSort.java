import java.util.*;

public class SelectionSort {
    static int[] sort(int[] arr){
        
        for (int i=0;i<arr.length-1;i++){
            int minIndex=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }

            int temp = arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        System.out.println(Arrays.toString(sort(arr)));
    }
    
}
