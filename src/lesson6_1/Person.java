package lesson6_1;

public class Person {
    //программа для обращения с людьми
    //поля характеризауют определенную сущность

    String name;
    int age;

    void printMe(){
        System.out.println("мое имя: " + name + ", мой возраст: " +
                age);
    }
    String aboutMe(){
        return name + " " + age + " лет";
    }
}
