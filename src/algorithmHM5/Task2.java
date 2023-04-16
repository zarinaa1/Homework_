package algorithmHM5;

public class Task2 {
    public static void printDigits(int n) {
        if (n < 10) {
            System.out.print(n + " ");
        } else {
            System.out.print(n % 10 + " ");
            printDigits(n / 10);
        }
    }
}
