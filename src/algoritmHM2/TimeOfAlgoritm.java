package algoritmHM2;

public class TimeOfAlgoritm {
    // Оценить временную сложность следующий алгоритмов:
    void test1(int n) {
        if (n == 1)
            return;
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= n; j++)
                System.out.println("");
        break;
    }


    private String word(String erste, String zweite) {
        String answer = "";
        for (int i = 0; i < Math.min(erste.length(), zweite.length()); i++) {
            if (erste.charAt(i) == zweite.charAt(i)) {
                answer += erste.charAt(i);
            } else {
            }

        }

        return answer;
    }
}

