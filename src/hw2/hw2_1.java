
package hw2;

/*Необходимо создать целочисленные переменные a и b, присвоить произвольные значения переменным на ваш выбор и
 вывести результаты следующих операций с этими переменными: сложение, умножение, вычитание, деление и остаток от деления.
 Также сделать проверку на четность этих переменных и вывести результат.
*/
public class hw2_1 {
    public static void main(String[] args) {
        int a  = 5;
        int b  = 2;

        System.out.println(a + b);
        System.out.println(a * b);
        System.out.println(a - b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println("");
//проверка на четность
        System.out.println(a % 2);
        System.out.println(b % 2);
    }
}
