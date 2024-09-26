package hw5;
import java.util.Arrays;

public class Hw5_3 {
    public static void main(String[] args) {

        /*Дан массив:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо вывести минимальное значение массива.
*/
        int minValue = Integer.MAX_VALUE;
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int i = 0; i < array.length; i++) {
            //если минимальное число больше элемента в массиве, то его записываем
            if (minValue > array[i]) {
                minValue = array[i];
            }
        }
        System.out.println(minValue);
    }
}
