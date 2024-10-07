package lesson7_1;
//урок Эдварда по методам

import java.util.Locale;

public class Test7_1 {

    //первый метод
    public static void sum(int a, int b){
        System.out.println("sum = " + (a + b));
    }

    //второй метод
    public static int getVolume(int length, int wigth, int heidth){
        //тут пишем что метод выполняет
        int Volume = length * wigth * heidth;
        //выводим результат на экран тут нужен чтобы его посмотреть на экране, иначе он присвоится в return
        System.out.println("Volume = " + Volume);
        //возвращает переменную, чтобы мы могли ее использовать в коде
        return Volume;
    }


    public static void main(String[] args) {
        //1
        sum(10, 25);

        //методы встроенные для типов через точку
        String name  = "Edward";
        String str = name.toUpperCase();
        System.out.println(str);

        //2
        getVolume(101,2,55);

        //из Cat
        Cat.catName();
        Cat.catAge(8);
        Cat.catColor("black");
        //Cat.catFood(); приватный и не виден внутри Cat

    }
}
