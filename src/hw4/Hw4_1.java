package hw4;
import java.util.Arrays;

/*Дан массив:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо вывести все нечетные числа из массива.
*/
public class Hw4_1 {
    public static void main(String[] args) {

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }
        }
//этот вариант нагляднее, так как видна переменная
        System.out.println("второй варинат решения");
        for (int i = 0; i < array.length; i++) {
            int elemets = array[i];
            if (elemets % 2 != 0) {
                System.out.println(elemets);
            }
        }
    }
}