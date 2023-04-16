package CopyMassiv;

import java.util.Arrays;

public class CopyOfRange {
    public static void main(String[] args) {


         int [] copyofRange = new int[5];

        copyofRange[0] =1;
        copyofRange[1] =2;
        copyofRange[2] =3;
        copyofRange[3] =4;
        copyofRange[4] =5;

        String copy;

        System.out.println(Arrays.toString(copyofRange));

        copy = Arrays.toString(Arrays.copyOfRange(copyofRange, 0,2));

        System.out.println(Arrays.toString(Arrays.copyOfRange(copyofRange, 0,2)));

        System.out.println(Arrays.toString(Arrays.copyOfRange(copyofRange, 3,5)));






    }


}
