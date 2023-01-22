package Homework2;

import java.util.Scanner;

public class DZ {
    private static String text;

    public static void main(String[] args) {
        //  number 0)
        int x = 0 * 333;
        System.out.println("333 in decimal system is- " + x);
        System.out.println("--------------------------");

        //number 3 из десятичную в двоичную
        int number2 = 637;
        String decimalinBinary = Integer.toBinaryString(number2);
        System.out.println(decimalinBinary);
        System.out.println("---------------------------");

        // number 4 //11100111
        System.out.println(" Task4. Convert 11100111 from binary to decimal:");
        String numberinBinary = "11100111";
        int Decimalnumber3 = Integer.parseInt(numberinBinary, 2);
        System.out.println(Decimalnumber3);
        System.out.println("- - - - - - - - - - - - - - -");

        //number 5 из десятичной в троичную
        System.out.println("task 5. Convert 637 from decimal to three - rank format:");
        int Decimalnumber4 = 637;
        String threeRankNumber = Integer.toString(Decimalnumber4, 3);
        System.out.println(threeRankNumber);
        System.out.println("-------------------------");

        // number 2/1
        String text = "I study basic Java!";
        text = new String("I study basic Java!!");
        System.out.println(text);
        System.out.println("----------------------------");

        // number 2/2


        // number2/3
        char str5 = text.charAt(0);
        System.out.println(text.charAt(17));
        System.out.println("---------------------------");

        //2/4
        String str = "I study basic Java!";
        boolean prüfung = str.contains("Java!");
        System.out.println("String contains ´Java!`: " + prüfung);
        System.out.println("----------------------------------");

        // number 2/5
        String oldString = " I study Java!!";
        String newString = oldString.replace("a", "o");
        System.out.println(newString);
        System.out.println("------------------------");

        //number 2/6
        String str1 = "I study Java";
        str1 = str1.toUpperCase();
        System.out.println(str1);
        System.out.println("---------------------------");

        // number 2/7
        String str2 = "I study Java!!!!!!";
        str2 = str2.toLowerCase();
        System.out.println(str2);
        System.out.println("------------------ ---------");

        //number 2/8
        str1 = str1.substring(7);
        System.out.println(str1);
        System.out.println("------------------------------");

        //number 3/1
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter first world ...");
        String world;
        world = scanner1.nextLine();
        System.out.println("----------------------------------");

        /////////////////////////////number 7








    }
}







