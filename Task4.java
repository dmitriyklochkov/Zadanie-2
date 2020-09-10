import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите целое число");
        int number = s.nextInt();
        if (number > 0) {
            ++number;
        } else {
            if (number < 0) {
                number -= 2;
            } else {
                number = 10;
            }
        }

        System.out.println(number);
    }
}
