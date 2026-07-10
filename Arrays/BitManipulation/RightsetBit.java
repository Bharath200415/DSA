import java.util.*;

public class RightsetBit{
    static int right(int n){
        return (n&(-n));
    }

    public static void main (String args[]){
        System.out.println(right(4));
        
    }
}