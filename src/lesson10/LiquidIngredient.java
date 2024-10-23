package lesson10;
//образец полиморфизма

public class LiquidIngredient extends Ingredient {

    public LiquidIngredient(String name, int volumeInMl) {
        super(name, volumeInMl + " ml");
    }
}
