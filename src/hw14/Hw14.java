package hw14;
/*Создать лист и добавить в него следующие слова:
White.
Tan.
Yellow.
Orange.
Red.
Pink.
Purple.
Blue.
Затем удалить из этого списка все цвета в которых встречается буква “L”
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Hw14 {
    public static void main(String[] args) {

        List<String> color = new ArrayList<>(List.of("White","Tan", "Yellow", "Orange","Red","Pink","Purple","Blue"));
        color.add(0, "LLLL");
        System.out.println("Список цветов : " + color);
                System.out.println();

        // Удаляем цвета, содержащие букву "L"
        Iterator<String> iterator = color.iterator();
        while (iterator.hasNext()) {
            String colors = iterator.next();
            if (colors.contains("L") || colors.contains("l")) { // Учитываем разный регистр
                iterator.remove();
            }
        }

        // Выводим измененный список
        System.out.println("Список цветов после удаления: " + color);
        System.out.println(color.size());



    }



}
