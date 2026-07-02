public class InfiniteBS{

    static int search(int[] arr, int target, int start, int end){
        while (start<=end){
            int mid = start+(end-start)/2;
            if (arr[mid]==target){
                return mid;
            }
            if (arr[mid]>target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
        
    }
    static int majorSearch(int[] arr, int target){
        int start=0;
        int end=1;

        while (target>arr[end]){
            int newStart = end+1;
            end = end+(end-start+1)*2;
            start = newStart;

        }

        return search(arr,target,start,end);
    }
    public static void main (String args[]){
        //bascically we assume that the array is infinite so obv we need to specify start and end 
        int[] arr = {12,34,56,78,99,104,112};
        System.out.println(majorSearch(arr,104));
    }
}