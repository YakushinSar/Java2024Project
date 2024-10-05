package hw6;
/*Необходимо создать класс Director с теми же методами,
 что и Manager, но метод getSalary должен возвращать
  результат по формуле - <базовая ставка> * (<количество подчиненных> / 100 * 9). Если количество подчиненных 0, то результат как у обычного рабочего.

 */
public class Director {
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
        return getBaseSalary() * getNumberOfSubordinates() / 100 * 9;
    }

    public int getNumberOfSubordinates(){
        return numberOfSubordinates;

    }
    public void setNumberOfSubordinates(int numberOfSubordinates){
        this.numberOfSubordinates = numberOfSubordinates;
    }

}
