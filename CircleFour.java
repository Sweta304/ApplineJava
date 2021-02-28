package Tasks;

import java.util.Scanner;

public class CircleFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //пользователь задает размерность матрицы
        System.out.print("Введите число строк: ");
        int x = scanner.nextInt();

        System.out.print("Введите число столбцов: ");
        int y = scanner.nextInt();

        int[][] customArray = new int[x][y];

        //пользователь задает элементы массива
        for (int i=0;i<x;i++){
            for (int j=0;j<y;j++){
                System.out.print("Введите ["+i+"]["+j+"] элемент массива: ");
                customArray[i][j] = scanner.nextInt();
            }
        }

        //вывод элементов первой строки матрицы, умноженных на 3
        System.out.println("Первая строка матрицы (элементы x3): ");
        System.out.print("[");
        for (int k=0;k<y;k++){
                System.out.print(customArray[0][k]*3);
                if(k!=y-1){
                    System.out.print(",  ");
                }
        }
        System.out.print("] ");
    }
}
