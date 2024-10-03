package lesson6_1;

public class Main {
    public static void main(String[] args) {

        /* Создаем экземпляр Person, тоесть john создается по
        чертежу описанному в классе Person*/
        Person john = new Person();
        john.name = "Джон";
        john.age = 23;

        Person janny = new Person();
        janny.name = "Джэнни";
        janny.age = 88;

        /*обращаемся к созданным полям
        кламма Main*/
        System.out.println("имя: " + john.name);
        System.out.println("возраст: " + john.age);
        System.out.println("");

        /*обращаемcя к методу из класса Персон, SOUT не пишем,
        так как это есть в методе класса Персон*/
        john.printMe();
        janny.printMe();
        System.out.println("");

        //вызовем метод aboutMe() из класса Person
        System.out.println(john.aboutMe());
        System.out.println(janny.aboutMe());
        System.out.println("");

        //выведем ссылки на ячейки памяти
        System.out.println(john);
        System.out.println(janny);

    }
}
