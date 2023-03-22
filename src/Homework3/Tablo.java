package Homework3;

import java.util.Random;

public class Tablo {
    public static void main(String[] args) {
        Random rnd = new Random(100);
        int a = rnd.nextInt();
        int b = a /60 /60;
        switch (b){
            case 0:
                System.out.println("До конца рабочего дня осталось пару минут");
                break;
            case 1:
                System.out.println("до конца рабочего дня осталось час" + b + "час");
                break;
            case 2:
                System.out.println("до конца рабочего дня осталось полчаса" + b + "пол часа");
                break;
            case 3:
                System.out.println("до конца рабочего дня осталось 2 часа" + b + "2 часа");

            default:

                System.out.println("до конца рабочего дня осталось 3 часа" + b + "3 часа");



        }
    }
}
