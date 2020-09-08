import java.util.*;

public class Task9 {
    public static void main(String[] args) {
        int[] m = {15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52};
        int[] n = new int[14];
        int k = 0;
        for (int i = 13; i >= 0; i--) {
            n[k] = m[i];
            k++;
        }

        String reverseString = Arrays.toString(n);
        System.out.println(reverseString);
    }
}