import java.util.*;

public class Task9 {
    public static void main(String[] args) {
        int[] arrays1 = {15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52};

        int[] arrays2 = new int[arrays1.length];

        int k = 0;
        for (int i = arrays1.length - 1; i >= 0; i--) {
            arrays2[k] = arrays1[i];
            k++;
        }

        String reverseString = Arrays.toString(arrays2);
        System.out.println(reverseString);
    }
}