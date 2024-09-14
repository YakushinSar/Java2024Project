package lesson5;
import java.util.Arrays;

public class Test5_1 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i == 5){
                break; //выходим из цикла, если i == 5
            }
            System.out.println(i);
        }
        System.out.println("");


        for (int i = 0; i < 10; i++) {
            if (i == 5 || i == 8){ //можно два условия поставить через ||
                continue; //прерывает итерацию, если i == 5, пятой итерации не будет
            }
            System.out.println(i);
        }
        System.out.println("");


        //проверка наличия l в строке
        String str = "hello world!";
        boolean isL = false;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'l'){
                isL = true;
                break;
            }

        }
        System.out.println("символ l есть в строке == " + isL);
        System.out.println("");

        //while, такая конструкция заменяет цикл
        int a = 6;
        while (a < 5) {//вывод будет если в () будет true
            System.out.println(a);
            a++;
        }
        System.out.println("");

        //do while с предусловием
        int b = 6;
        do { //один вывод будет, так как выполнится условие в do
            System.out.println(b);
            b++;
        } while (b < 5);

    }
}

