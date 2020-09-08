import java.util.*;

public class Task10 {
    public static void main(String[] args) {
        int[] m = {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};
        int[] n = new int[14];
        int quantityNul = 0;
        int k = 0;
        for (int i = 0; i < 14; i++) {
            if (m[i] != 0) {
                n[k] = m[i];
                k++;
            } else {
                quantityNul++;
                continue;
            }
        }
        k = 13;
        for (int i = 1; i <= quantityNul; i++) {
            n[k] = 0;
            k--;
        }

        String nString = Arrays.toString(n);
        System.out.println(nString);
    }

}