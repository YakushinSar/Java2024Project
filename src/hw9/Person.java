package hw9;

public class Person {

    /*Необходимо создать класс Person с полями:
    имя, возраст, пол. Класс должен иметь метод - getName,
    метод возвращает имя с префиксом “Mr. ” если пол указан как мужской
    и префикс “Mrs. ” если женский
     */

    private String name;
    private int age;
    private char sex;

    public Person(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    protected String getNameWirhoutPrefix(){
        return name;
    }


    public String getName(){
        if (sex == 'M') {
            return  "Mr. " + name;
        } else if (sex == 'F'){
            return  "Mrs. " + name;
        }else{
            return name;
        }
    }

    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }
}
