import java.util.*;
public class z8 {
    public static void main(String[] args) {
        int[] m = {1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2};
        int i=0;
        int max = m[i];
        int SumPologit = 0;
        double SumOtric = 0.0;
        int SumChetOtric = 0;
        int KolvoPol = 0;
        int KolvoOtric = 0;
        double SredArifmetOtric = 0.0;
        for (;i<14;i++) {
            if (max < m[i]) max = m[i];
            if (m[i] > 0) {
               KolvoPol++;SumPologit += m[i];
           }
           if (m[i]<0) {
               KolvoOtric++; SumOtric += m[i];
               if ((m[i] % 2) == 0) SumChetOtric += m[i];
           }



        }
        SredArifmetOtric =  SumOtric / KolvoOtric;
        System.out.println ("������������ �������� "+max);
        System.out.println ("����� ������������� ��������� "+SumPologit);
        System.out.println ("����� ������ ������������� ��������� "+SumChetOtric);
        System.out.println ("���������� ������������� ��������� "+KolvoPol);
        System.out.println ("������� �������������� ������������� ��������� "+SredArifmetOtric);
    }

}