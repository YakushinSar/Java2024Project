package hw8;

public class Hw8 {
    public static void main(String[] args) {

        System.out.println(numberToText(1234));

    }

    /*Написать статический метод, превращающий натуральное
     (целое положительное) число (например, 643) в строку,
      состоящую из названий цифр этого числа (например, “шесть четыре три”).
     */
public static String numberToText(int number){

    String[] words = {"ноль", "один", "два","три","четыре","пять","шесть","семь","восемь","девять"};

    //получаем строку и делим на массив символов
char[] digitChars = String.valueOf(number).toCharArray();

    String result = "";
    String separator = "";
    for (char digitChar : digitChars) {
        int digitInt = Integer.parseInt(String.valueOf(digitChar));
        String word = words[digitInt];
        result += separator + word;
        separator = " ";
    }
    return result;
}
}
