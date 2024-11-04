package lesson14;

import java.util.*;

public class ListClass {
    public static void main(String[] args) {

//        другая запись List
//        String[] strAr = new String[5];
//        можем добавлять/удалять элементы,обновлять нельзя
//        изменяемый лист
        java.util.List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        strings.add("!");

        System.out.println(strings);

        strings.add(2, "1111");
        System.out.println(strings.get(2));

        strings.remove(0);
        System.out.println(strings);
        strings.add(0, "Hello");
        System.out.println();

//        неизменяемый лист
        java.util.List<String> strings1 = java.util.List.of("Hello", "World", "!");
        System.out.println(strings1);
        System.out.println();

//        более удобная запись изменяемого листа
        java.util.List<String> strings2 = new ArrayList<>(java.util.List.of("aa", "bb", "ab"));
        strings2.add(2, "12345");
        System.out.println(strings2);
        System.out.println("размер листа: " + strings2.size());
        System.out.println();


        System.out.println(strings2);
        System.out.println("начинаются на 'а' элементы: " + filterStartStringA(strings2));

    }

    private static java.util.List<String> filterStartStringA(java.util.List<String> strs) {
        java.util.List<String> result = new ArrayList<>();
        for (String element:strs){
            if (element.startsWith("a")) {
                result.add(element);
            }
        }
        return result;
    }

}

