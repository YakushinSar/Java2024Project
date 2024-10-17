package lesson9_1;

public class Main {
    public static void main(String[] args) {
//тут два параметра от родителя
        Person person1 = new Person();
        person1.setName("Jhon");
        person1.age = 23;

//тут +2 новых параметра от потомка
        Worker worker1 = new Worker();
        worker1.setName("Ivan");
        worker1.age = 45;
        worker1.salary = 5000;
        worker1.companyName = "IT";


        Famaly famaly1 = new Famaly();
        famaly1.spouseName = "Irina";

        System.out.println(famaly1.spouseName);
        System.out.println(person1.getName());
    }
}
