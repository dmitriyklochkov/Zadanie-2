import java.util.*;

public class Task6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите целое число");
        int a = s.nextInt();
        int remains = a % 2;
        String parity;
        String sign = null;
        if (remains == 0) {
            parity = " четное";
        } else {
            parity = " нечетное";
        }
        if (a > 0) {
            sign = "положительное";
        } else {
            if (a < 0) {
                sign = "отрицательное";
            } else {
                sign = "нулевое";
                parity = "";
            }
        }
        System.out.println(sign + parity + " число");

    }
}