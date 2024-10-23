package lesson10;

public abstract class Cooking {
    public static void main(String[] args) {

/*  так работать не будет , так как в  Ingredient создан дефолтный контструктор
        Ingredient potatoes = new Ingredient();
        potatoes.name = "potatoes";
        potatoes.amount = "2kg";
*/

// запись новая, уже с конструктором Ingredient со всеми аргументами
        Ingredient milk = new Ingredient("milk","100 ml",true );

// с конструктором Ingredient но без аргумента shouldWarm
        Ingredient butter = new Ingredient("butter","50 g");

/* пример использования константы final, тот она запретит переопределить
переменную во второй раз, то есть без butter
 */
        final String allIngredients = "potatos, milk, butter";
        System.out.println(allIngredients);
//        allIngredients = "potatos, milk";//тут запрет от final
        System.out.println(allIngredients);



        Ingredient potatoes = new SouldIngredient("potatoes",1.5);
        System.out.println(potatoes.getDescription());

        Ingredient milk1 = new LiquidIngredient("milk", 100);
        System.out.println(milk1.getDescription());

//        можно создать массив из ингредиентов
        Ingredient[] allIngred = { potatoes, milk1 };
    }
}
