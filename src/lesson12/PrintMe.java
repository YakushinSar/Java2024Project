package lesson12;

public class PrintMe {
    public static void main(String[] args) {

//        при вызове одинакового метода джава берет нужный в зависимости ОТ передаваемого аргумента
        printMe(5);
        printMe(12.5);
//        printMe(new Student());

    }
//    метод и название может быть одним, а передаваемые аргументы - разными
    public  static void printMe(int me){
        System.out.println(me);
    }

    public  static void printMe(double me){
        System.out.println(me);
    }

    public  static void printMe(Object me){
        System.out.println(me.toString());
    }
}
