package hw5;
import java.util.Arrays;

public class Hw5_4 {
    public static void main(String[] args) {

        /*Дан массив:
int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
необходимо вывести среднее арифметическое всех значений массива
*/
        int sumArifm = 0;
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < array.length; i++) {
            sumArifm = sumArifm + array[i];
        }
        System.out.println(sumArifm / array.length);
    }
}
