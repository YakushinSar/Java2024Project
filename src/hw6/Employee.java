package hw6;
/*Необходимо создать класс Employee со следующими методами:
getBaseSalary - получить базовую ставку
setBaseSalary
getName - получить имя
setName
getSalary - получить зарплату
*/

public class Employee {
    //зарплата
    double getBaseSalary;
    //имя сотрудника
    String name;

    //возвращаем значение зарплата
    public double getBaseSalary(){
        return getBaseSalary;
    }

    //возвращает имя
    public String getName(){
        return name;
    }
    //меняет имя, принимает параметр name  и меняет его
    public void setName(String name){
        this.name = name;
    }

    //меняет зарплату
    public  void setBaseSalary(double getBaseSalary){
        this.getBaseSalary = getBaseSalary;

    }
    public double getSalary(){
        return getSalary();
    }
}
