package Tasks;

import java.util.Scanner;

public class CircleOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //пользователь задает длину массива
        System.out.print("Введите кол-во элементов массива: ");
        int length = scanner.nextInt();
        int[] myArray = new int[length];

        //задаем константы, с которыми будем сравнивать пользовательский массив
        int[] constArray = new int[]{3,4,5};

        //пользователь задает элементы массива
        for (int i=0;i<length;i++){
            System.out.print("Введите "+ i +"-й элемент массива: ");
            myArray[i] = scanner.nextInt();
        }

        //флаг для вывода из цикла при первом совпадении значений массивов
        boolean flag = false;


        for (int j=0;j<constArray.length;j++) {
            for(int k=0;k<myArray.length;k++){
                if (constArray[j] == myArray[k]) {
                    flag=true;
                }
            }
            if (flag == true) {
                System.out.println("Данное значение имеется в константах");
                break;
                }
            }
        }
    }

