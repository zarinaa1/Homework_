package algoritmHM4;

public class PicElement {
    private static void Task2(int [][] array) {
        int n=array.length;
        int m = array[0].length;
        int[][] table = new int[n+1][m+1];
        int max = array[0][0];
        for (int i = 0; n < n; n++) {
            for (int j = 0; j < m; j++) {
                if( array[i][j]>max)
                    max = array[i][j];
            }
        }

    }

}
