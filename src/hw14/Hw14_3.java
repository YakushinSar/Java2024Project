package hw14;
/*
Удалить из листа, созданного в предыдущей задаче, все четные элементы
 */

import java.util.ArrayList;
import java.util.List;

public class Hw14_3 {
    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            if(i % 2 != 0)       {
                intList.add(i);
            }
        }

        intList.removeIf(num -> num % 2 == 0);
        System.out.println(intList);
    }
}
