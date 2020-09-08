import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Vvedite chislo");
        int a = s.nextInt();
        a %= 10;
        System.out.println(a);

    }
}
