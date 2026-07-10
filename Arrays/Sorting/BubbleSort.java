import java.util.*;

public class BubbleSort{
    static int[] bubble(int[] arr){

        boolean swapped=false;

        for (int i=0;i<arr.length;i++){
            for (int j=1;j<(arr.length-i);j++){
                if (arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if (!swapped){
                return arr;
            }

        }
        return arr;
    }
    public static void main(String agrs[]){
        int[] arr={3,4,5,1,2};
        System.out.println(Arrays.toString(bubble(arr)));

    }
}