package lesson2;

public class Test2 {
    public static void main(String[] args) {

//объявляем переменные
        int x = 10;
        int y = 15;

//выводим результат при работе со значениями
        System.out.println(x + y);
        System.out.println(20 + x);
        System.out.println("");

//пример задачки 1
        int regular = 75;
        int doppler = 25;
        int archers = 65;
        int leut = 2;
        int capitan = 1;

        int baseSalary = 6;

        int summa = regular * baseSalary
                + doppler * 8 * baseSalary
                + archers * 12 * baseSalary
                + leut * 40 * baseSalary
                + capitan * 100 * baseSalary;
        System.out.println(summa);
        System.out.println("");

//пример задачки 2
        int age = 75;
        System.out.println(age + age / 2 + age / 4);//age * 1.75

        double yearsMoreLive = 125;
        System.out.println(yearsMoreLive / 1.75);
        System.out.println("");

//char
        char c = 100;
        System.out.println(c);

        char letterD = 'D';
        char result = (char) (letterD + 1);
        //непечатается следующий символ из таблицы ASCII
        System.out.println(result);
        System.out.println("");

//str
        //будет разный вывод, так как работает конкатенация, склеивание, код читается слева-направо
        System.out.println(1 + 2 + "a");
        System.out.println("b" + 1 + 2);
    }
}
