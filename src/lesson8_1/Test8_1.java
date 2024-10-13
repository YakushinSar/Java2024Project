package lesson8_1;

public class Test8_1 {
    public static void main(String[] args) {
        //1 метод
        printSum(2,10);

        //2 метод
        int result = plus(10,20);
        System.out.println(result);

        System.out.println(plus(1, plus(1,1)) + 2);

        //3 метод
        printHello();

        //4 метод с Person
        Person john = new Person();
        john.name = "Джон";
        john.age = 30;

        System.out.println(john.name);

        //5 метод с Person createPerson
        Person ivan = Person.createPerson("Ivan",44);
        System.out.println(ivan.name);

        System.out.println(ivan.info());
    }

    //ничего void не возвращает ничего
    public static void printSum(int a,int b){
        int sum = a + b;
        System.out.println(sum);
    }

    //возвращает что в return
    public static int plus(int a, int b){
        int sum = a +b;
        return sum;
    }
    public static void printHello(){
        System.out.println("hello");
    }

}
