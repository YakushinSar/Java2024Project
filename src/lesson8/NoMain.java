package lesson8;

public class NoMain {
    public static void main(String[] args) {
        /*для вызова метода с другого класса надо в начале поставить
        имя класса откуда он берется
         */
        System.out.println(Main.concat("I am ","now"));
    }
}
