package hw3;
/*Необходимо вывести все числа кратные 4 между числами
 40 и 60 включительно.

Реализовать 2 варианта:
1.использовать конструкцию if для определения кратности
        (цикл с шагом 1, i = i + 1);
2.без использования конструкции if
        (шаг цикла на ваше усмотрение).
*/


public class Hw3_6 {
    public static void main(String[] args) {

        System.out.println("c if");
        System.out.println("");
        //использовать конструкцию if
        for (int i = 40;  i <= 60 ; i = i + 1) {
            if (i % 4 == 0)  //если число кратно 4, выводим его
                System.out.println(i);


        }
        System.out.println("");
        System.out.println("без if");

        /*без использования конструкции if, конструкция из if преобразуется
        в секции j = j + 4
        */

        for (int j = 40; j < 61 ; j = j + 4) {
            System.out.println(j);

        }
    }
}
