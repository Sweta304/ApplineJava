package Tasks;

import java.util.Locale;

public class DataTypesTwo {
    public static void main(String[] args) {
        String str = "I like Java!!!";
        boolean check_1 = str.contains("Java");
        boolean check_2 = str.startsWith("I like");
        boolean check_3 = str.endsWith("!!!");
        if (check_1==true & check_2==true & check_3==true){
            System.out.println(str.toUpperCase());
        }
        String strNew = str.replace('a','o');
        System.out.println(strNew.substring(7,11));


    }
}
