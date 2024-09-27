package hw5;
import java.util.Arrays;

public class Hw5_7 {
    public static void main(String[] args) {

        /*Дан массив:
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        необходимо вывести количество элементов в массиве.
*/
        int count = 0;
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        for (int i = 0; i < array.length; i++) {

            count += array[i].length; //считаем количество элементов в массиве

        }
        System.out.println(count);
    }
}

