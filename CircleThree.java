package Tasks;

import java.util.Scanner;

public class CircleThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //пользователь задает длину массива
        System.out.print("Введите кол-во элементов массива: ");
        int length = scanner.nextInt();
        double[] myArray = new double[length];

        //пользователь задает элементы массива
        for (int i=0;i<length;i++){
            System.out.print("Введите "+ i +"-й элемент массива: ");
            myArray[i] = scanner.nextDouble();
        }

        //вычисляем среднее арифметическое для элементов массива
        double sum = 0;

        for (int j=0;j<length;j++){
            sum=sum+myArray[j];
        }
        Double avg=sum/length;

        //выводим элементы массива, умноженные на среднее арифметическое
        System.out.println("Элементы массива: ");
        for (int k=0;k<length;k++) {
            sum = sum + myArray[k];
            System.out.println(myArray[k] * avg);
        }
    }
}
