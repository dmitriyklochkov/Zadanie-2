import java.util.*;
public class z10 {
    public static void main(String[] args) {
        int[] m = {15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52};
        int[] n = new int[14];
        int KolNul = 0;
int k=0;
        for (int i=0;i<14;i++) {
            if (m[i] != 0) {
                n[k] = m[i];
                k++;
            } else {
                KolNul++;
                continue;
            }
        }
            k = 13;
           for (int i=1;i<=KolNul;i++) {
               n [k] = 0; k--;
           }

        String nString = Arrays.toString(n);
        System.out.println (nString);
    }

}