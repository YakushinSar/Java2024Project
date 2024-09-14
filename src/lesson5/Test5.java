package lesson5;
import java.util.Arrays;

public class Test5 {
    public static void main(String[] args) {

        /*массив это ссылочный тип, то есть ссылка одна,
        а ссылаться на нее могут многие массивы, тоесть
        в памяти хранится ТОЛЬКО ОДНА ссылка на массив
        */
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = arr1;
        int[] arr3 = arr2;

        arr2[0] = -1;
        arr1[3] = -4;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println("");

        //атрибуты
        String str = "Hello world!";

        System.out.println(str.length());
        System.out.println(str.contains("Hello"));
        System.out.println(str.contains("Привет"));
        System.out.println(str.indexOf("world"));
        System.out.println(str.charAt(0));

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        /*строка не поменяется, так как атрибут создал НОВУЮ строку,
        а не модифицировал ее. Создается ВТОРАЯ строка
        */
        System.out.println("строка после изменений " + str);
        System.out.println("");

        System.out.println(str.replace('!', '&'));
        System.out.println(str.replace("l", "--"));
        System.out.println("");

        //первый и последний индекс l
        System.out.println(str.indexOf('l'));
        System.out.println(str.indexOf('o', 5));//индекс со смещением начиная со 2 индекса вправо
        System.out.println(str.lastIndexOf('l'));

        System.out.println(str.length());
        System.out.println(str.charAt(6));

        for (int i = 0; i < str.length(); i++) {
            //вывод будет в столбик
            System.out.println(str.charAt(i));
            System.out.println("");
        }

        for (int i = 0; i < str.length(); i++) {
            /*поиск индекса по наименованию буквы в строке
            тут сравниваем в примере чар с чаром
             */
            if (str.charAt(i) == 'w') {
                System.out.println("index of w is " + i);

            }
        }
        System.out.println("");

        //посчитать сколько l в строке
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'l') {
                count = count + 1;
            }
        }
        System.out.println("в строке " + count + " букв(ы) l");


        System.out.println("");

        /*подсчет букв в массиве
        сначала заходим в первую строку "Hello" и
        перебираем там буквы вложенным циклом тоесть в
        строке i перебираем буквы j,
        затем заходим в строку "world", тоесть в верхний цикл
        и так далее
         */
        String[] massiv = {"Hello", "world", "!"};

        int sum = 0;
        for (int i = 0; i < massiv.length; i++) {
            for (int j = 0; j < massiv[i].length(); j++) {
            /* massiv[i] значит что обращаемся к i-тому
            элементу массива
            massiv[i] это строка, а charAt(j) это символ в строке
            */
                if (massiv[i].charAt(j) == 'l') {
                    sum++;
                }
            }
        }
        System.out.println("в массиве " + sum + " букв(ы) l");
        System.out.println("");

        //напечатать кубик 10*10 из 0 и '
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i >= 3 && i <= 6 && j >= 3 && j <= 6) {
                    System.out.print(" 0");
                } else {
                    //это () означает переход строки
                    System.out.print(" '");
                }
            }
            System.out.println();
        }
        System.out.println("");

        //перебор двумерных массивов, рваного

        int[][] arrTwo = {
                {2, 4},
                {6, 7, 8, 9},
                {10, 12}
                        };

        for (int i = 0; i < arrTwo.length; i++) {
            for (int j = 0; j < arrTwo[i].length; j++) {
                System.out.println(arrTwo[i][j]);

            }
        }
        System.out.println("");

        //распечатать двумерный массив без цикла с помошью метода deep
        System.out.println(Arrays.deepToString(arrTwo));

        System.out.println("");


    }
}