package lesson8;

public class MainStr {
    public static void main(String[] args) {
        String[] words = {
                "Hello",
                "world",
                "!",
                "and",
                "my"
        };

        System.out.println(shortestString(words));

        String shortest = shortestString(new String[0]);
        if (shortest != null) {
            System.out.println(shortest);
        } else {
            System.out.println("у нас пустой массив");
        }
        System.out.println();

        System.out.println("-->" + makeText(words) + "<--");
    }

    /*метода принимает как аргументы массив строк
    и находит минимальный элемент массива
     */
    public static String shortestString(String[] strings){
        if (strings.length == 0){
            //System.out.println("массив пустой");
            return null; // так как при пустоте надо чтото вернуть в Джаве
        }
        String shortest = strings[0];
        for (String str:strings){
            if (str.length() < shortest.length()){
                shortest = str;
            }
        }
        return shortest;
    }

    public static String makeText(String[] words) {
        String result = "";
        for (int i = 0; i < words.length; i++) {
            if (i == 0) {
                result = words[i];

            } else {
                result += " " + words[i];
            }
        }
        return result;
    }
}




