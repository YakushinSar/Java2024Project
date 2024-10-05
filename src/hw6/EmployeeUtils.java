package hw6;
/*
Необходимо создать утилитарный класс (класс только со статическими полями и методами) со следующими методами:
поиск сотрудника в массиве по его имени
поиск сотрудника в массиве по вхождению указанной строки в его имени
подсчет зарплатного бюджета для всех сотрудников в массиве
поиск наименьшей зарплаты в массиве
поиск наибольшей зарплаты в массиве
поиск наименьшего количества подчиненных в массиве менеджеров
поиск наибольшего количества подчиненных в массиве менеджеров
поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров

 */
public class EmployeeUtils {

    //поиск сотрудника в массиве по его имени
    public static Employee findByName(Employee[] employees, String byName) {
        for (Employee employee : employees) {
            if (employee.getName().equals(byName)) {
                return employee;
            }
        }
        return null;
    }
}
//поиск сотрудника в массиве по вхождению указанной строки в его имени
public  static Employee findBySubstring(Employee[] employees, String substring){
    for (Employee employee : employees) {
        if (employee.getName().contains(substring)) {
            return employee;
        }
    }
    return null;
}


//подсчет зарплатного бюджета для всех сотрудников в массиве
public static double getTotalSalary(Employee[] employees){
    double total = 0;
    for (Employee employee : employees) {
        total += employee.getSalary();
    }
    return total;
}

//поиск наименьшей зарплаты в массиве
public static double minSalary(Employee[] employees){
    if (employees.length == 0){
        System.out.println("ошибка, нельзя найти минимум в пустом массиве");
        return - 1;
    }
    double min = employees[0].getSalary();
    for (int i = 1; i < employees.length; i++) {
        if (employees[i].getSalary() < min){
            min = employees[i].getSalary();
        }
    }
    return min;
}

//поиск наибольшей зарплаты в массиве
public static double maxSalary(Employee[] employees){
    if (employees.length == 0){
        System.out.println("ошибка, нельзя найти максимум в пустом массиве");
        return - 1;
    }
    double max = 0;
    for (int i = 0; i < employees.length; i++) {
        if (employees[i].getSalary() < max){
            max = employees[i].getSalary();
        }
    }
    return max;
}
//поиск наименьшего количества подчиненных в массиве менеджеров
public static int minSubordinates(Manager[] managers){
    if (managers.length == 0){
        System.out.println("ошибка, нельзя найти минимум в пустом массиве");
        return - 1;
    }
    int min = managers[0].getNumberOfSubordinates();
    for (int i = 1; i < managers.length; i++) {
        if (managers[i].getNumberOfSubordinates() < min){
            min = managers[i].getNumberOfSubordinates();
        }
    }
    return min;
}
//поиск наибольшего количества подчиненных в массиве менеджеров
public static int maxSubordinates(Manager[] managers){
    if (managers.length == 0){
        System.out.println("ошибка, нельзя найти максимум в пустом массиве");
        return - 1;
    }
    int max = managers[0].getNumberOfSubordinates();
    for (int i = 1; i < managers.length; i++) {
        if (managers[i].getNumberOfSubordinates() > max){
            max = managers[i].getNumberOfSubordinates();
        }
    }
    return max;
}
//поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
public static double maxBonus(Manager[] managers){
    if (managers.length == 0){
        System.out.println("ошибка, нельзя найти максимум в пустом массиве");
        return - 1;
    }
    double maxBonus = managers[0].getBonus();
    for (Manager manager : managers){
        double bonus = manager.getBonus();
        if (bonus > maxBonus){
            maxBonus = bonus;
        }
    }
    return maxBonus;
}

//поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
public static double getMinBonus(Manager[] managers) {
    if (managers.length == 0) {
        System.out.println("ошибка, нельзя найти минимум в пустом массиве");
        return -1;
    }
    double minBonus = getBonus(managers[0]);
    for (Manager manager : managers) {
        double bonus = getBonus(manager);
        if (bonus > minBonus) {
            minBonus = bonus;
        }
    }
    return minBonus;

}
public static  double getBonus(Manager manager) {
    return manager.getSalary() - manager.getBaseSalary();
}




