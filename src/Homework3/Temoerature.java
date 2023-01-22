package Homework3;

public class Temoerature {
    public static void main(String[] args) {
         double a1 = 100;
         double b =120;
         chek(a1, b);  //вызываем метод


    }
    public static void chek(double a , double b ){
        if ( a < 100){
            System.out.println("слишком низкая температура");
        }
        else if (a>120 && b>120){
            System.out.println("Температура слишком высокая");
        }
        else {
            System.out.println("все в порядке ");
        }
    }
}
