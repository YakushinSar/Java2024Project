package hw6;
/*Необходимо создать класс Manager в который нужно добавить следующие методы:
getNumberOfSubordinates - получить количество подчиненных
setNumberOfSubordinates
в классе, метод getSalary будет возвращать значение по формуле
- <базовая ставка> * (<количество подчиненных> / 100 * 3).
Если количество подчиненных 0, то результат как у обычного рабочего.

*/

public class Manager {
    //колчичество подчиненных
    int numberOfSubordinates;
    double getBaseSalary;
    String name;

    public double getBaseSalary(){
        return getBaseSalary;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public  void setBaseSalary(double getBaseSalary){
        this.getBaseSalary = getBaseSalary;

    }
    public double getSalary(){
        return getBaseSalary() * getNumberOfSubordinates() / 100 * 3;
    }

    public int getNumberOfSubordinates(){
        return numberOfSubordinates;

    }
    public void setNumberOfSubordinates(int numberOfSubordinates){
        this.numberOfSubordinates = numberOfSubordinates;
    }
    public  double getBonus(){
        return getSalary() - getBaseSalary();
    }
}
