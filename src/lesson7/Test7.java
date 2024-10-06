package lesson7;

public class Test7 {
    //создание собственного метода, можно создать вне main метода
    public static void sum(int a, int b, String text ){
        System.out.println(text + (a + b));
    }

    public static void concat(String str1, String str2){
        System.out.println(str1 + str2);
    }
    /*метод с возвратом в return, вместо воит пишем тип возращвемого
    в return. Вохвращаемое значение в ретерн может быть только одно
    z будет видна только внутри метода */
    public static int sum1(int a, int b ){
        int z = a + b;
        return  z;
    }

    public static String concat1(String str1, String str2, String str3){
        return str1 + str2 + str3;
    }

    public static void main(String[] args) {

        String str = "Hello world!";

        //метод замены символов, str тут является объектом от которого вызывам ф-ию replace
        String str2 = str.replace("ll", "tt");

        System.out.println(str2);
        System.out.println();

        //вызов собственного метода, передача аргументов, запустить созданный метод можно ТОЛЬКО внутри main метода
        sum(5, 10, "sum : ");
        concat("good ", "day");

        //вызов собственного метода с передачей аргументов, в этом случае аргументы являются локальными переменными и не могут быть использованы вне данного блока кода
        String a = "hello ";
        String b = "world";
        concat(a,b);

        int first = 10;
        int second = 20;

        System.out.println(sum1(first,second));

        System.out.println(concat1("my ","name -", " andrey"));


    }
}
