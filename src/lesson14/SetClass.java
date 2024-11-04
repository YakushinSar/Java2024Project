package lesson14;

import java.util.HashSet;
import java.util.Set;

public class SetClass {

    public static void main(String[] args) {

//        исключает повторение входящих элементов
        Set<Integer> intSet = new HashSet<>();
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(3);
        intSet.add(2);
        intSet.add(1);
        System.out.println(intSet);

        intSet.remove(3);
        System.out.println(intSet);


    }
}
