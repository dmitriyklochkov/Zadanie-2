import java.util.*;

public class Task6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите целое число");
        int number = s.nextInt();
        int remains = number % 2;
        String parity;
        String sign = null;
        if (remains == 0) {
            parity = " четное";
        } else {
            parity = " нечетное";
        }
        if (number > 0) {
            sign = "положительное";
        } else {
            if (number < 0) {
                sign = "отрицательное";
            } else {
                sign = "нулевое";
                parity = "";
            }
        }
        System.out.println(sign + parity + " число");

    }
}