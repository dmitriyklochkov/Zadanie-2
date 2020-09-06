import java.util.*;
public class z7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите код города");
        int a = s.nextInt();
        String Gorod = null;
        Double Stoimosty = 0.0;
        Double t = 10.0;
        if (a == 905) {
            Gorod = "Москва.";
            Stoimosty = t * 4.15;
        }
        if (a == 194) {
            Gorod = "Ростов.";
            Stoimosty = t * 1.98;
        }
        if (a == 491) {
            Gorod = "Краснодар.";
            Stoimosty = t * 2.69;
        }
        if (a == 800) {
            Gorod = "Киров.";
            Stoimosty = t * 5.00;
        }
            System.out.println(Gorod+ " Стоимость разговора: "+Stoimosty);

    }
}