package hw9;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = {
               new Employee("John Doe", 30, 'M', 1500),
                new Employee("Jane Smith", 40, 'F', 1000),
                new Employee("Bob Johnson", 35, 'M', 3000)
        };

        System.out.println(SalaryUtils.getSum(employees));
    }
}
