import java.util.*;
public class z6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("������� ����� �����");
        int a = s.nextInt();
        int b = a % 2;
        String ch;
        String p = null;
        if (b==0)  ch = " ������";
        else ch = " ��������";
        if (a > 0)  p = "�������������";
        if (a < 0)  p = "�������������";
        if (a==0) {
            p = "�������";
            ch = "";
        }
        System.out.println(p+ch+" �����");
    }
}