import java.util.*;
public class z5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("¬ведите целое число");
        int a = s.nextInt();
        if (a > 0)  ++a;
        if (a < 0)  a-=2;
        if (a==0) a = 10;
        System.out.println(a);
    }
}