package lesson8;

public class Main {
    public static void main(String[] args) {
        //метод void ничего не возвращает
        /*как вывести результат метода который чтото возвращает
        в return через присваивание
         */
        String result  = concat("hello ","gays!");
        result = concat(result," HI");
        System.out.println(result);

        /*или сразу поставить в вывод, результат ничему
        не можем присвоить так как нет переменных типа void
         */
        System.out.println(concat("A ","B"));
        System.out.println(concat(concat("d ","h"), " !"));
    }

    //метод concat существует в классе Main
    public static String concat(String st1, String st2){
        return st1 + st2;
    }
}
