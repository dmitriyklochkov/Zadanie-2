import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите трехзначное число");
        int a = s.nextInt();
        int sumOfNumbers = 0;
        for (int i = 1; i <= 3; i++) {

            int Numbers = a % 10;
            a /= 10;
            sumOfNumbers += Numbers;
        }
        System.out.println(sumOfNumbers);

    }
}