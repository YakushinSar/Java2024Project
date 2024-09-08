package lesson4;
import java.util.Arrays;

import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {
        /* июль: 15.0, 21.8, 20.5, 18.9
        август: 22.8, 25.6, 30.5, 24.8, 26.8
         */

        //есть такой вариант написания
        double[] julyRides1 = new double[]{15.0, 21.8, 20.5, 18.9};
        //есть такой вариант написания, он лучше, он без new double[]
        double[] julyRides = {15.0, 21.8, 20.5, 18.9};

        //распечатается ссылка на массив
        System.out.println(julyRides);
        //распечатается содержимое массива
        System.out.println(Arrays.toString(julyRides));
        System.out.println("");

        /*total это входная точка от нее идет расчет,
        к которому прибавляются значения цикла
        julyRides.length значит
        что цикл работает до конца длины цикла
        в примере index все рано что i, это для примера
        */
        double total = 0;
        for (int index = 0; index < julyRides.length; index++){
            System.out.println("индекс массива = " + index);
            System.out.println("значение массива = " + julyRides[index]);

            total = total + julyRides[index];
            System.out.println("Сумма всех значений = " + total);
        }
        //печатает только итог, так как находится после } массива
        System.out.println("");
        System.out.println("итого всего сумма = " + total);

        System.out.println("длина массива julyRides = " + julyRides.length + " элемента");
        System.out.println("");

        //пустой массив на 15 элементов
        int[] array = new int[15];
        System.out.println(array.length);
        System.out.println(Arrays.toString(array));
        System.out.println("");

        //раньше так объявляли массив, теперь так не делают
        double[] augustRides = new double[6];
        //сначала там пусто
        System.out.println(Arrays.toString(augustRides));
        augustRides[0] = 25.6;
        augustRides[1] = 11.9;
        augustRides[2] = 26.8;
        augustRides[3] = 22.8;
        augustRides[4] = 24.8;
        augustRides[5] = 30.5;


        System.out.println(Arrays.toString(augustRides));
        System.out.println("длина массива = " + augustRides.length);
        System.out.println("пятый индекс = " + augustRides[5]);
        System.out.println("");

        //находим минимум в массиве, по сравнению с самым большим числом для double
        double min = Double.MAX_VALUE;
        for (int i = 0; i < augustRides.length; i++) {
            if (augustRides[i] < min){
                min = augustRides[i];
            }
        }
        System.out.println("минимальное число = " + min);
        System.out.println("");

        //многомерные массивы
        double[][] allRides = {
                {15.0, 21.8, 20.5, 18.9},
                {25.6, 11.9, 26.8, 22.8, 24.8, 30.5}
        };
        System.out.println(Arrays.toString(allRides[0]));
        System.out.println(Arrays.toString(allRides[1]));
        System.out.println("длина массива allRides = " + allRides.length + " элемента");

        System.out.println(allRides[0][3]);
        System.out.println(allRides[1][5]);
        System.out.println("");

        double max = Double.MIN_VALUE;

        // перебираем первый массив
        for (int i = 0; i < allRides.length; i++) {
            //перебираем второй  массив
            for (int j = 0; j < allRides[i].length; j++) {
                if (allRides[i][j] > max) {
                    max = allRides[i][j];
                }
            }
        }
        System.out.println("максимальное число = " + max);
        System.out.println("");

        /*можно так перебирать массивы,
        это сокращенная форма, удобный способ
        за счет того что тут не используются индексы,
        используется ТОЛЬКО при ИНКРЕМЕНТЕ индекса ==1!!!
         */
        int[] massiv = {10, 20, 30 ,40};
        for (int i : massiv){
            System.out.println(i);

        }
        System.out.println("");
        System.out.println(massiv.length);
        System.out.println(massiv[2]);
    }
}

