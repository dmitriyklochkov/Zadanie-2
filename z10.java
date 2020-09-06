import java.util.*;
public class z10 {
    public static void main(String[] args) {
        int[] m = {15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52};
        int KolNul = 0;

        for (int i=0;i<14;i++) {
            if (m[i] == 0) {
                KolNul++;
                continue;
            }
            System.out.printf(m[i] + ",");
        }
            for (int i=1;i<=KolNul;i++) {
                System.out.printf (0+",");
            }

    }

}