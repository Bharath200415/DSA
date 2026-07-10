import java.util.*;

public class Powerofnumber{
    static int find(int base, int power){
        int ans=1;
        while (power>0){
            if ((power&1)==1){
                ans*=base;
            }

            base*=base;
            power>>=1;
        }
        return ans;
    }
    public static void main (String args[]){
        System.out.println(find(3,5));
        


    }
}