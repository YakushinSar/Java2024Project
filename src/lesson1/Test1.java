package lesson1;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("Andrey!");
        System.out.println("");

        // \n переносит строку,
        // \" добавляет ковычки
        System.out.println("Andrey! \nAndrey!");
        System.out.println("Andrey! \n\"Andrey!\"");

        System.out.println("");

        //print без окончения ln не переносит строку
        System.out.print("Hello ");
        System.out.print("Andrey!");

        //конкатенация-склеивание
        System.out.println("");
        System.out.println("Hello " + "Andrey" + " !!!!");
    }
}

