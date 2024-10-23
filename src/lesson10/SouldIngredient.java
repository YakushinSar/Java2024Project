package lesson10;

public class SouldIngredient extends Ingredient{

    // добавляем новый конструктор, который вызывает конструктор родительского класса
    public SouldIngredient(String name, double weithInKg) {
        super(name, weithInKg + " kg");


    }
}
