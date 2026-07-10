import java.util.*;

public class CountSetBits{
    static int count(int n){
        int count=0;
        while (n>0){
            n=n-(n&(-n));
            count++;
        }
        return count;
    }
    public static void main(String args[]){
        System.out.println(count(9));
        
    }
}