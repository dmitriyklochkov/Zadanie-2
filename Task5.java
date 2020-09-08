import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int array[] = new int[size]; // Создаём массив int размером в size
        System.out.println("Введите целые числа через пробел");


        for (int i = 1; i < size; i++) {
            array[i] = input.nextInt();
        }
        int min = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] <= min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }
}
