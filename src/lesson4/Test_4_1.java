package lesson4;
import java.util.Arrays;

public class Test_4_1 {
    public static void main(String[] args) {

        // найти максимум 2х чисел
        int a = 5;
        int b = 12;

        if (a > b) {
            System.out.println("a > b");
        } else {
        /*если в первом SOUT условие не выполнится,
        и будет false, то распечатается второй SOUT
        */
            System.out.println("a < b");
            System.out.println("");
        }
        System.out.println("");

        //проверить что числа положительные, отрицательные или 0
        if (a > 0) {
            System.out.println("число положительное");
        } else if (a == 0) {
            System.out.println("это 0");
        } else {
            System.out.println("число отрицательное");
        }
        System.out.println("");

        //циклы
        int a1 = 2;
        int b1 = 3;
        int sum = 0;
        // сложили циклом a1 три раза
        for (int i = 0; i < 10; i++) {
            sum = sum + a1;
        }
        System.out.println("сумма a1 = " + sum);
        System.out.println("");

        //с if
        int a3 = 22;
        int b3 = 3;
        int result = 0;

        if (a3 > b3) {
            for (int i = b3; i > 0; i--) {
                result = result + a3;
                if (result > 40) {
                    break;
                }
            }
        } else {
            for (int i = 0; i < a3; i++) {
                result = result + b3;
            }
        }
        System.out.println("результат будет = " + result);
        System.out.println("");

        //массивы- существует разная форма записи
        //когда знаем значения в массиве
        int[] arr = {1, 2, 3};
        System.out.println("разные ссылки на массив - " + arr);
        System.out.println(Arrays.toString(arr));

        //когда НЕ знаем значения в массиве
        arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        //индекс находится за границами массива
        //arr[3] = 4;

        System.out.println("разные ссылки на массив - " + arr);
        //можем изменить значение по индексу
        arr[0] = 10;
        System.out.println(Arrays.toString(arr));
        System.out.println("");

        //влож массив
        int[][] numbers = {{1, 12, 13, 124},
                {99, 5, 6, 15}};

        //находим максимальное число
        int max = Integer.MIN_VALUE;
        //находим сумму всех чисел
        int summa = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(" " + numbers[i][j]);
                summa = summa + numbers[i][j];

                if (max < numbers[i][j]){
                    max = numbers[i][j];
                }
            }
            /*для переноса значений второго массива на новую строку,
            иначе распечатается в одну строку
            */
            System.out.println("");

            System.out.println("сумма массива = " + summa);
        }
        System.out.println("");
        System.out.println("максимальное число в массивах = " + max);
    }
}


    


