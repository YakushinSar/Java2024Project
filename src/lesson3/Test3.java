package lesson3;

public class Test3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 50;

        /*переменные созданные внутри {},
        видимы только внутри скобок,
        вне скобок они не видимы
        */
        {
            int x = 100;
        }
        //условия if
        if ((a < 100 && b > 10) || b == 60) {
            System.out.println("Верный результат!!!");
            System.out.println("");
        } else {
            System.out.println("НЕ верный результат");
            System.out.println("");
        }
        //цикл for
        for (int i = 0; i < 25; i = i + 5) {
            System.out.println("Цикл");
            System.out.println("Как идет цикл-> " + i);
            System.out.println(i);
            System.out.println("");
        }
        //цикл for в цикле
        for (int i = 0; i < 5; i = i + 1) {
            for (int j = 0; j < 5; j = j + 1) {
                System.out.println("i первого цикла = " + i);
                System.out.println("j второго цикла = " + j);
                System.out.println("");
            }
        }
    }
}
