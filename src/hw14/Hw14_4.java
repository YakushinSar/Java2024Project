package hw14;

import java.util.ArrayList;
import java.util.List;
/*
Попробуйте изменить тип итерационной переменной из цикла, в третьей задаче, на Integer (не int, а Integer) и добиться такого же результата как и с типом int.
 */

public class Hw14_4 {
    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();

        // Заполняем список числами от 0 до 999
        for (Integer i = 0; i < 1000; i++) {
            intList.add(i); // Добавляем все числа
        }

        // Выводим исходный список
        System.out.println("Исходный список чисел: " + intList);

        // Удаляем четные числа
        intList.removeIf(n -> n % 2 == 0);


        System.out.println("Список после удаления четных чисел: " + intList);
    }
}

