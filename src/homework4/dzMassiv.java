package homework4;

import java.util.Arrays;

public class dzMassiv {
    public static void main(String[] args) {
        //     Создайте массив из 8 случайных целых чисел из интервала [1;50]
        //     Выведите массив на экран в строку
        //     Замените каждый элемент с нечётным индексом на ноль
        //     Снова выведете массив на экран на отдельной строке

        int [] Azbuka = {1,2,3,3,4,5,6,7,8,9,10};
                System.out.println(Arrays.toString(Azbuka));
        for (int i = 0; i < Azbuka.length ; i++) {
            if (i%2==0){
                Azbuka [i] =0;
                System.out.println(Arrays.toString(Azbuka ));
            }

        }


    }
}
