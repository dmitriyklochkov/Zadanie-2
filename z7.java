import java.util.*;
public class z7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("������� ��� ������");
        int a = s.nextInt();
        String Gorod = null;
        Double Stoimosty = 0.0;
        Double t = 10.0;
        if (a == 905) {
            Gorod = "������.";
            Stoimosty = t * 4.15;
        }
        if (a == 194) {
            Gorod = "������.";
            Stoimosty = t * 1.98;
        }
        if (a == 491) {
            Gorod = "���������.";
            Stoimosty = t * 2.69;
        }
        if (a == 800) {
            Gorod = "�����.";
            Stoimosty = t * 5.00;
        }
            System.out.println(Gorod+ " ��������� ���������: "+Stoimosty);

    }
}