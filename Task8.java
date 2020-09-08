import java.util.*;

public class Task8 {
    public static void main(String[] args) {
        int[] m = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        int i = 0;
        int max = m[i];
        int sumPositiv = 0;
        double sumNegativ = 0.0;
        int sumParityNegativ = 0;
        int quantityPositive = 0;
        int quantityNegativ = 0;
        double averageNegative = 0.0;
        for (; i < 14; i++) {
            if (max < m[i]) {
                max = m[i];
            }
            if (m[i] > 0) {
                quantityPositive++;
                sumPositiv += m[i];
            } else {
                if (m[i] < 0) {
                    quantityNegativ++;
                    sumNegativ += m[i];
                    if ((m[i] % 2) == 0) {
                        sumParityNegativ += m[i];
                    }
                }
            }
        }
        averageNegative = sumNegativ / quantityNegativ;
        System.out.println("Максимальное значение " + max);
        System.out.println("Сумма положительных элементов " + sumPositiv);
        System.out.println("Сумма четных отрицательных элементов " + sumParityNegativ);
        System.out.println("Количество положительных элементов " + quantityPositive);
        System.out.println("Среднее арифметическое отрицательных элементов " + averageNegative);
    }

}