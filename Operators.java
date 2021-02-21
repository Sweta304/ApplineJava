package Tasks;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        //ввести 3 числа с клавиатуры
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите число x: ");
        int x = scanner.nextInt();
        System.out.print("введите число y: ");
        int y = scanner.nextInt();
        System.out.print("введите число z: ");
        int z = scanner.nextInt();
        //среднее арифметическое x,y,z
        double avg = (x+y+z)/3;
        //деление среднего арифметического на 2 и округление вниз
        double div = Math.floor(avg/2);
        //условие "если div>3"
        String answer = (div>3)?"Программа выполнена корректно":" ";
        System.out.println(answer);

    }
}

