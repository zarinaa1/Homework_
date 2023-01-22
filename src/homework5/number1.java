package homework5;

public class number1 {
    public static void main(String[] args) {
        //Дан массив размера  N-1  , который должен содержать только целые числа в диапазоне от  1 до N .
        // Каждое число представлено в одном экземпляре, кроме одного числа.  Найдите недостающий элемент.

        int total_num;
        int[] numbers = new int[]{1,3,5,4,6,7};
        total_num = 7 ;
        int expected_num_sum = total_num * ((total_num + 1) / 2);
        int num_sum = 0;
        for (int i: numbers) {
            num_sum += i;
        }
        System.out.print( expected_num_sum - num_sum);
        System.out.print("\n");


    }
}
