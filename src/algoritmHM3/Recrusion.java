package algoritmHM3;

public class Recrusion {
    public static void hanoi(int n, int source, int target, int aux) {
        if (n == 1) {
            System.out.println(source + " -> " + target);
        } else {
            hanoi(n - 1, source, aux, target);
            System.out.println(source + " -> " + target);
            hanoi(n - 1, aux, target, source);
        }



    } public static void main(String[] args) {
        int n = 3;
        int source = 1;
        int target = 3;
        int aux = 2;
        hanoi(n, source, target, aux);
    }
}

