import java.util.*;

public class Task7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите код города");
        int a = s.nextInt();
        String city = null;
        double cost = 0.0;
        double t = 10.0;
        if (a == 905) {
            city = "Москва.";
            cost = t * 4.15;
        }
        if (a == 194) {
            city = "Ростов.";
            cost = t * 1.98;
        }
        if (a == 491) {
            city = "Краснодар.";
            cost = t * 2.69;
        }
        if (a == 800) {
            city = "Киров.";
            cost = t * 5.00;
        }
        System.out.println(city + " Стоимость разговора: " + cost);

    }
}