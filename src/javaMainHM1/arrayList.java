package javaMainHM1;

import java.util.ArrayList;
import java.util.List;

public interface arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(0);
        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);
        integerArrayList.add(4);
        integerArrayList.add(5);
        integerArrayList.add(6);
        integerArrayList.add(7);
        System.out.println(integerArrayList.size());
        integerArrayList.add(0,4);
        integerArrayList.add(9,1000);
        System.out.println(integerArrayList);

        for (int i = 0; i < integerArrayList.size(); i++) {
            Integer element = integerArrayList.get(i);
            System.out.println(i + "- elemet of Massiv; " );

            integerArrayList.remove(4);
            //integerArrayList.remove(0)




            List<Integer> time = new ArrayList<>();
            // заполнение списка
            for (int i1 = 0; i < 10000000; i++) {
                time.add(i);
            }

            // вывод размера списка
            System.out.println("Размер списка: " + time.size());


        }
    }
}
