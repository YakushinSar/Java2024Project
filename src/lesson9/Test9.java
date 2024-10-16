package lesson9;

public class Test9 {
    public static void main(String[] args) {
/*это конкретный экземпляр по абстракции(чертежу)
класса Person
*/
        Person person1 = new Person();
        person1.setName("John");
        person1.age = 23;


        Person person2 = new Person();
        person2.setName("Jane");
        person2.age = 25;

        //наследуемся от Worker с новым атрибутом salary
        Worker person3 = new Worker();
        person3.setName("Bob");
        person3.age = 30;
        //будет недоступно, так как поле приватно в Worker
        // person3.salary = 5000;

        //использование сеттера
        person3.setSalary(5000);
        //вызов с помощью геттера
        System.out.println(person3.getSalary());

        System.out.println(person2.getName());



    }
}
