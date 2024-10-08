package hw7;
/*Необходимо написать 4 метода:
сложение 2х чисел
вычитание 2х чисел
умножение 2х чисел
деление 2х чисел
*/
public class Hw7 {

    public static int sum(int a, int b){
        return a + b;
    }
    public static void sum1(int a,int b){
        System.out.println(a + b);
    }

    public static int subtract(int a, int b){
        return a - b;
    }

    public static void subtract1(int a, int b){
        System.out.println(a - b);
    }

    public static int multiply(int a, int b){
        return a * b;
    }

    public static double divide(int a, int b){
        return a / b;
    }

    public static void main(String[] args) {

        System.out.println(sum(1,3));
        System.out.println(subtract(100,50));
        System.out.println(multiply(3,3));
        System.out.println(divide(200,4));
        System.out.println("");

        sum1(2,4);
        subtract1(99,2);
    }
}
