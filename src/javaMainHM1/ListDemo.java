package javaMainHM1;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(); // создаем пустой список

        int nummer;

        for (int i = 0; i < 10000000; i++) {
            int temp = i; // сохраняем i-ый элемент в переменную temp
            myList.add(temp); // добавляем temp в список

        }

        //for (int element : myList) { // перебираем элементы списка с помощью цикла for-each
        //    int size = myList.size(); // вызываем метод size() для каждой итерации
        //    System.out.println("Element: " + element + " Size: " + size);}


        // for (int i = 0; i < myList.size(); i++) {
        //    int size = myList.size();
        //}

        //for (int i = 0; i < myList.size(); i++) {
         //   nummer = myList.size();  }

        //for (int i = 0; i < myList.size(); i--) {
        //    nummer = myList.size();  }

        List<Integer> time = new ArrayList<>();
        // заполнение списка
        for (int i1 = 0; i1 < 10000000; i1++) {
            time.add(i1);
        }

        // вывод размера списка
        System.out.println("Размер списка: " + time.size());





}}
