package hw5;
import java.util.Arrays;

public class Hw5_2 {
    public static void main(String[] args) {
        /*Дан массив:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо вывести максимальное значение массива
*/
        //любое число которое будет больше минимального
        int maxValue = Integer.MIN_VALUE;
        int[] array = {9, 2, 6, 4, 5, 120, 7, 8, 6};
        for (int i = 0; i < array.length; i++) {
            //если масимальное число меньше элемента в массиве то его записываем
            if (maxValue < array[i] ) {
                maxValue = array[i];
            }
        }
        System.out.println(maxValue);
    }
}



