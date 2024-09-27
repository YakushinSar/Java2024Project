package hw5;
import java.util.Arrays;

public class Hw5_6 {
    public static void main(String[] args) {

        /*Дан массив:
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        необходимо вывести максимальное значение массива.
*/
        int maxValue = Integer.MIN_VALUE;
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (maxValue < array[i][j]) {
                    maxValue = array[i][j];
                }

            }

        }
        System.out.println(maxValue);
    }
}
