package lesson9;

public class Worker extends Person {

    //это наследование
    //инкапсуляция private
    private int salary;


    //методы (геттеры/сеттеры) для доступа к приватному полю salary
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}

