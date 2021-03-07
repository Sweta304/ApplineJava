package Tasks;

import java.util.Scanner;

public class DataTypesOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //пользователь вводит числа с клавиатуры
        System.out.print("Введите число: ");
        String x = scanner.nextLine();
        System.out.print("Введите число: ");
        int y = scanner.nextInt();

        //Приводим числа к одному типу
        int x1 = Integer.parseInt(x);

        //Выводим в консоль максимальное число
        System.out.print("Максимальное число: ");
        System.out.println(Math.max(x1,y));

        //Преобразуем int в double и выводим в консоль
        double min = Math.min(x1,y);
        System.out.print("Минимальное число: ");
        System.out.println(min);

    }
}
