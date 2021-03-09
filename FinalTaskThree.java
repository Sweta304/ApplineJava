package Tasks;

import java.util.Scanner;

public class FinalTaskThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Кол-во строк: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        //в этот массив записываем кол-во совпадений для каждой строки
        int[] result = new int[n];

        //в этот массив записываем строки полностью
        String [] list = new String[n];

        //идентификатор совпадения
        boolean flag = false;

        //счетчик для кол-ва повторяющихся символов
        int count = 0;

        //ищем максимальное кол-во неповторяющихся символов
        int max = 0;

        //строка с максимальным кол-вом неповторяющихся символов
        String maxStr = null;

        for (int i = 0; i < n; i++) {
            System.out.print("Строка "+(i+1)+": ");
            String str = scanner.nextLine();
            list [i] = str;
            char[] charStr = str.toCharArray();

            for (int k = 0; k < charStr.length; k++) {
                    flag = !(str.substring(k+1).contains(String.valueOf(charStr[k])));
                    if (flag) {count=++count;}
                }
            result[i]=count;
            //System.out.println(result[i]);
            count=0;

            for(int m=0;m<result.length;m++){
                if(max<result[m]){
                    max=result[m];
                    maxStr=list[i];
                }
            }
        }
        System.out.print("Ответ: ");
        System.out.println(maxStr);
    }
}