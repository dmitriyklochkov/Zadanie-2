import java.util.*;
public class z8 {
    public static void main(String[] args) {
        int[] m = {1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2};
        int i=0;
        int max = m[i];
        int SumPologit = 0;
        int SumChetOtric = 0;
        int KolvoPol = 0;
        double KolvoOtric = 0;
        Double SredArifmetOtric = 0;
        for (;i<14;i++) {
           if (m[i+1] >= m[i]) max=m[i+1];
           if (m[i] > 0) {
               KolvoPol++;SumPologit+=m[i];
           }
           if (m[i]<0) {
               KolvoOtric++;Double SredArifmetOtric = ( SredArifmetOtric + (double)m[i])/KolvoOtric;
           }
        }

        System.out.println (max);
    }

}