package lesson22;

import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(1, "Peter", 5000.0),
                new Employee(2, "Sterling", 6000.0),
                new Employee(3, "Homer", 7000.0)
        );

        // стрим
        employees
                .stream()
                .filter(employee -> employee.salary > 5000)// для фильтрации в стриме
                .map(employee -> employee.id + ". " + employee.name)   //map может поменять тип, тут переводим в строку
                .forEach(line -> System.out.println("stream - " + line));
        System.out.println();


        double sum = 0;
        for (Employee e : employees){
            sum += e.salary;
        }
        System.out.println(sum);
        System.out.println();

        for (Employee e : employees){
            System.out.println(e.id + ". " + e.name);
        }
    }
}

class Employee {
    final int id;
    final String name;
    final double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;



//работа со стримом
        Stream.of(-5,-3,0,1,2,3,4,3,-2,-5)
                .skip(2)
                .limit(6)
                .map(i -> i + 1)
                .filter(i -> i > 0)
                .forEach(i -> System.out.println(i));
    }

}
