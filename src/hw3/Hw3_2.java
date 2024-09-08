package hw3;
/*Необходимо создать две целочисленные переменные (a, b), присвоить произвольные значения переменным на ваш выбор и вывести следующие строки:
maybe a and b are even - если сумма переменных четная
some variable is odd - если сумма переменных нечетная
*/
public class Hw3_2 {
    public static void main(String[] args) {
        int a = 50;
        int b = 61;
        int sum = a + b;

        if (sum % 2 == 0){
            System.out.println("сумма переменных четная");
        }else{
            System.out.println("сумма переменных НЕ четная");
        }
    }
}

