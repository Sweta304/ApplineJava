package Tasks;

import java.util.Scanner;

public class CircleTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое положительное число: ");
        int custom = scanner.nextInt();

        int sum=0;

        int [] myArray = new int[custom];
        for (int i=0;i<custom;++i){
            myArray[i]=i;
            if(!(myArray[i] % 2 == 0)){
                sum=sum+i;
            }
        }
        System.out.println("Сумма нечетных чисел до "+custom+" = "+sum);
    }
}

