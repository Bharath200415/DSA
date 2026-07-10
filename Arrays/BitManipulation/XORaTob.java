import java.util.*;


public class XORaTob{
    static int xor(int n){
        if (n%4==0){
            return n;
        }

        if (n%4==1){
            return 1;
        }
        if (n%4==2){
            return n-1;
        }
        if (n%4==3){
            return 0;
        }
        return -1;

    }
    public static void main (String args[]){
        int a = 3;
        int b = 6;

        System.out.println(xor(a-1)^xor(b));

    }
}