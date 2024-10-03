package lesson6_1;
import java.util.Arrays;

import java.lang.reflect.Array;

public class Test6_1 {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4};
        int[] b = {5, 6, 7, 8};
        int[][] c = {{1, 2}, {4, 5}, {9, 10}};

        //выведутся не значения, а ссылка на область памяти
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("");

        //выведутся значения
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.deepToString(c));
        System.out.println("");

        a = b;
        //теперь a и b указывают на одну и ту же область памяти
        System.out.println(a);
        System.out.println(b);
        System.out.println("");

        a[0] = -122;
        //измениться в обоих, так как при a = b ссылка на память стала одинаковой
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println("");



    }
}
