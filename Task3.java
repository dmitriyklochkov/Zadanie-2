import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите целое чило");
        int a = s.nextInt();
        if (a > 0) {
            a += 1;
        }
        System.out.println(a);
    }
}