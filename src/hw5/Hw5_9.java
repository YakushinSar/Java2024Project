package hw5;
import java.util.Arrays;

public class Hw5_9 {
    public static void main(String[] args) {

        /*Дана строка:
String s = “Перевыборы выбранного президента”;
необходимо подсчитать количество букв “е” в строке.
Для указанной строки ответ будет 4.
*/
        int countA = 0;
        String s = "Перевыборы выбранного президента";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'е'){
                //увеличиваем на 1 переменную которую ранее сохранили
                countA = countA + 1;
            }
        }
        System.out.println(countA);
    }
}


