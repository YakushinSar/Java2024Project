package lesson10;

public class Ingredient {

    private final String name;
    private final String amount;
    private final boolean shouldWarm;

    //конструктор
/* не обязательно в конструкторе передвать в качестве
аргументов все поля, но из надо у казать в this,
как например shouldWarm
 */
    public Ingredient(String amount, String name) {
        this.amount = amount;
        this.name = name;
        this.shouldWarm = false; //по умолчанию нужно ничего не готовить
    }

/* конструкторы можно вызывать от других конструкторов, второй вариант записи
public Ingredient(String amount, String name) {
    this(name, amount, shouldWarm false);
}
*/


    // конструктор со всеми полями в списке аргументов
    public Ingredient(String name, String amount, boolean shouldWarm) {
        this.name = name;
        this.amount = amount;
        this.shouldWarm = shouldWarm;
    }

    //геттеры для конструктора, сеттеры НЕ НУЖНЫ уже
    public String getName() {
        return name;
    }

    public String getAmount() {
        return amount;
    }

    public boolean isShouldWarm() {
        return shouldWarm;
    }

    public  String getDescription(){
        return amount + " of " + name;
    }
}
