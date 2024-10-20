package hw9;


/*Необходимо создать класс Salary с единственным методом
 - getSum(Employee[] employeeArray), метод должен возвращать сумму
  зарплат всех сотрудников из массива переданного в качестве аргумента вызова метода
 */

public class SalaryUtils {

    public static int getSum(Employee[] employeeArray){
        int sum = 0;
        for (int i = 0; i < employeeArray.length; i++) {
            sum += employeeArray[i].getSalary();

        }
        return sum;
    }
}
