package Tasks;

import java.util.Scanner;

public class FinalTaskFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = null;
        boolean flag = false;//флаг на проверку правильности ответа
        boolean flagtrick = false;//флаг на проверку использования подсказки

        for (int i = 0; i < 3; i++) {
            System.out.println("Отгадай загадку. Попытка " + (i + 1));
            answer = scanner.nextLine().toLowerCase();
            switch (answer) {
                case ("заархивированный вирус"):
                    System.out.println("Правильно!");
                    flag = true;
                    break;
                default:
                    if(flagtrick){
                        flag = true;
                        break;
                    } else {
                        System.out.println("Если хотите подсказку, напишите 'Подсказка'");
                        String trick = scanner.nextLine();
                        if (trick.equals("Подсказка") && i == 0) {
                            System.out.println("вредоносный объект ПО");
                            flagtrick = true;
                            break;
                        } else if (trick.equals("Подсказка") && i > 0) {
                            System.out.println("Подсказка уже недоступна");
                        } else {
                            continue;
                        }
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


