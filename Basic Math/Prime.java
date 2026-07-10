import java.util.*;

public class Prime{
    static boolean check(int n){
        if (n<2){
            return false;
        }

        // for (int i=2;i<n;i++){
        //     if (n%i==0){
        //         return false;
        //     }
        // }

        //optimized code:
        for (int i=2;i*i<=n;i++){
            if (n%i==0){
                return false;
            }
        }

        return true;
    }

    static void primeseries(int n){
        System.out.println(2);
        for (int i=3;i<n;i+=2){
            if (check(i)){
                System.out.println(i);
            }
        }
        
    }
    public static void main (String args[]){
        System.out.println(check(9));


    }
}