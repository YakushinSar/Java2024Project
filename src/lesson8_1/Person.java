package lesson8_1;

public class Person {
    String name;
    int age;

    public static Person createPerson(String name, int age){
        //создание нового экземпляра класса
        Person person = new Person();
        person.name = name;
        person.age = age;

        return person;
    }
    String info(){
        return "Имя: " + name + ", Возраст: " + age;
    }
}
