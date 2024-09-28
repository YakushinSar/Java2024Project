package hw5;

public class Hw5_10 {
    public static void main(String[] args) {

        /*
        Дана строка:
String s = “Посмотрите как Рите нравится ритм”;
необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
Для указанной строки ответ будет 6, 15, 29.
*/

        String s = "Посмотрите как Рите нравится ритм";
        //переводим в нижний регистр, чтобы избавиться от регистрозависимости
        s = s.toLowerCase();
        String subStr = "рит";

        for (int i = 0; i < s.length() - subStr.length(); i++) {
            if (s.substring(i, i + subStr.length()).equals(subStr)){
                System.out.println(i);
            }

        }
    }
}


