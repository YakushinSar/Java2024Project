package hw14;
/*
Создать лист со значениями от 100 до 1000
 */

import java.util.ArrayList;
import java.util.List;

public class Hw14_2 {
    public static void main(String[] args) {

        List<Integer> intNum = new ArrayList<>();

        for (int i = 0; i < 1000 ; i++) {
            intNum.add(i);

        }
        System.out.println(intNum);
    }
}
