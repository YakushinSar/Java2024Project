package hw9;

/*Необходимо создать класс Employee с полями как у Person (из предыдущего задания)
 и поле зарплата. Класс должен иметь метод isSameName(Employee employee) который возвращает true, если у сотрудника у которого был вызван метод и сотрудника который был передан как параметр,
 одинаковое имя
 */
public class Employee extends Person{

    private int salary;



    public Employee(String name, int age, char sex, int salary) {
        super(name, age, sex);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isSameName(Employee employee){
       return this.getNameWirhoutPrefix().equals(employee.getNameWirhoutPrefix());
    }


}
