package hw5;
import java.util.Arrays;

public class Hw5_1 {
    public static void main(String[] args) {

        /*Дан массив:
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        необходимо вывести сумму всех значений массива.
        */
        int sum = 0;
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("сумма чисел будет - " + sum);
    }
}
