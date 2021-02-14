package Tasks;

import java.util.Arrays;

public class ArraysTask {
    public static void main(String[] args) {
        int [] someArray = {10,23,21,12,39};
        int temp = someArray[0];
        someArray[0]=someArray[4];
        someArray[4]=temp;
        System.out.println(someArray[0]+someArray[2]);
    }

}
