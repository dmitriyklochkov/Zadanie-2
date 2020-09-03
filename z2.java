import java.util.*;
public class z2{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите трехзначное число");
        int a = s.nextInt();
        int k = 0;
        for (int i = 1;i<=3;i++){

            int b = a % 10;
             a /= 10;
             k += b;
        }
        System.out.println(k);

    }
}