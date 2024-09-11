package hw4;

import java.util.Arrays;

/*Дан массив из десяти произвольных целых чисел (например, { 1, 2, …, 9, 10 } )

Необходимо изменить порядок элементов массива на противоположный
(т.е. чтобы получилось { 10, 9, …, 2, 1 } ). Не НАПЕЧАТАТЬ в обратном порядке,
 а переставить элементы массива
*/
public class Hw4_4 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        array[0] = 10;
        array[1] = 9;
        array[2] = 8;
        array[3] = 7;
        array[4] = 6;
        array[5] = 5;
        array[6] = 4;
        array[7] = 3;
        array[8] = 2;
        array[9] = 1;

        System.out.println(Arrays.toString(array));
        System.out.println("");
        System.out.println("второй способ");

        for (int i = 0; i < args.length / 2; i++) {
            int index = array.length - i - 1;
            //меняем местами array[i] и array[index]
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
