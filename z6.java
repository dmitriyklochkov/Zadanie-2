import java.util.*;
public class z6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите целое число");
        int a = s.nextInt();
        int b = a % 2;
        String ch;
        String p = null;
        if (b==0)  ch = " четное";
        else ch = " нечетное";
        if (a > 0)  p = "положительное";
        if (a < 0)  p = "отрицательное";
        if (a==0) {
            p = "нулевое";
            ch = "";
        }
        System.out.println(p+ch+" число");
    }
}