package lesson7_1;


//usages это показывается сколько раз данный метод используется в коде
public class Cat {
//public это значит что видимый везде
    public  static void catName(){
        System.out.println("name = " + "Tom");
    }
    public  static void catAge(int a){
        System.out.println("age = " + a);
    }
    public  static void catColor(String color){
        System.out.println("color = " + color);
    }
    //private значит не виднев вне класса, видимый только в классе в котором создан
    private static void catFood(){
        System.out.println("viskas");
    }

    //приватный метод виден только внутри данного класса
    public static void main(String[] args) {
        catFood();
    }
}
