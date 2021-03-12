package Tasks;

import java.util.Scanner;

public class FinalTaskFour2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = null;
        boolean flag = false;//флаг на проверку правильности ответа
        boolean flagtrick = false;//флаг на проверку использования подсказки
        System.out.println("Отгадай загадку: Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");

        for (int i = 0; i < 3; i++) {
            System.out.println();
            System.out.println("Попытка " + (i + 1));
            answer = scanner.nextLine().toLowerCase();
            switch (answer) {
                case ("заархивированный вирус"):
                    System.out.println("Правильно!");
                    flag = true;
                    break;
                default:
                    if (flagtrick) {
                        flag = true;
                        break;
                    } else if (answer.equals("подсказка") && i == 0) {
                            System.out.println("вредоносный объект ПО");
                            flagtrick = true;
                            break;
                    } else if (answer.equals("подсказка") && i > 0) {
                            System.out.println("Подсказка уже недоступна");
                    }
                    }
            if (flag){
                break;
            }
        }
        if (!answer.equals("заархивированный вирус")){
            System.out.println("Обидно! Приходи в другой раз");
        }
    }
}