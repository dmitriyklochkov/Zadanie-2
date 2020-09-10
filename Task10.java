import java.util.*;

public class Task10 {
    public static void main(String[] args) {
        int[] array1 = {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};
        int[] array2 = new int[array1.length];
        int quantityNul = 0;
        int k = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != 0) {
                array2[k] = array1[i];
                k++;
            } else {
                quantityNul++;
                continue;
            }
        }
        k = array1.length-1;
        for (int i = 1; i <= quantityNul; i++) {
            array2[k] = 0;
            k--;
        }

        String nString = Arrays.toString(array2);
        System.out.println(nString);
    }

}