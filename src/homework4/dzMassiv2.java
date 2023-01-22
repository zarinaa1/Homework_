package homework4;

import java.util.Arrays;

public class dzMassiv2 {
    public static void main(String[] args) {
        //Создайте массив из 5 случайных целых чисел из интервала [10;99]
        //    Выведите его на экран в строку.
        //    Определите и выведите на экран сообщение о том, является ли массив строго возрастающей последовательностью. (отредактировано)

        int [] name ={1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(name));

        boolean Flag = true;
        for (int i = 0; i< name.length ; i++) {
            if (name[i] <= name[i+1]){
                Flag = false;
                 break;

            }
        }
        if (Flag){
            System.out.println("Массив возрастает");
        }
        else {
            System.out.println("массив строго возрастающей последовательностью");
        }
    }
}
