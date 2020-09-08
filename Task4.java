import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите целое число");
        int a = s.nextInt();
        if (a > 0) {
            ++a;
        } else {
            if (a < 0) {
                a -= 2;
            } else {
                a = 10;
            }
        }

        System.out.println(a);
    }
}
