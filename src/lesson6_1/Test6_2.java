package lesson6_1;
import java.util.Arrays;

public class Test6_2 {
    public static void main(String[] args) {

        /*вызываем функцию/метод, созданную ниже
        метод может быть расположен в любом месте кода,
        необязательно именно перед вызовом функции
         */
        firstStep();

        int result;
        result = firstStepTwo() * 2;//тут умножится на 2 результат из return, но вывода не будет

        int resultSum = sum(1, 3);
        System.out.println("resultSum будет = " + resultSum);
        System.out.println("");

//можно вкладывать в качестве аргументов метод/функцию
        int resultSumTwo = sum(10, sum(2, 2));
        System.out.println("resultSumTwo будет = " + resultSumTwo);
    }

    //void значит что функция/метода firstStep ничего не возвращает
    static void firstStep() {
        int[] a = {1, 2, 3, 4};
        int[] b = {5, 6, 7, 8};

        System.out.println(a);
        System.out.println(b);
        System.out.println("");

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println("");

        a = b;
        System.out.println(a);
        System.out.println(b);
        System.out.println("");

        a[0] = -122;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println("");
    }

    //без void, вместо него тип int возвращвемого указанного в return
    static int firstStepTwo() {
        int[] a = {1, 2, 3, 4};
        int[] b = {5, 6, 7, 8};

        System.out.println(a);
        System.out.println(b);
        System.out.println("");

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println("");

        a = b;
        System.out.println(a);
        System.out.println(b);
        System.out.println("");

        a[0] = -122;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println("");

        return 12;
    }

    /*функция для суммирования двух чисел,
     возвращает результат в виде int, с аргументами типа int
     */
    static int sum(int first, int second) {
        int results = first + second;
        return results;
    }
}






