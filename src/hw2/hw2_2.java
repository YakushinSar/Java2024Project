package hw2;
/*Создать программу дележа добычи на пиратском корабле. По обычаю, половина добычи идет владельцу корабля,
половина оставшегося — капитану, остальное делится поровну между всеми членами команды, включая капитана.
Размер добычи (например, в пиастрах) и количество пиратов на корабле задать переменными.
Вывести на экран кому сколько пиастров полагается
Сколько получит капитан (Джек Воробей, естественно), если он утверждает, что корабль принадлежит ему?
Дополнительное задание со звездочкой
Попробовать придумать как программа может проверить правильность дележа.
*/
public class hw2_2 {
    public static void main(String[] args) {
    int dobycha = 1000;
    int piratov = 10;
    int boss = 1;
    int kapitan = 1;

    int dolyaBoss = dobycha / 2 /boss;
    int dolyaKapitan = (dobycha - dolyaBoss) / 2 / kapitan;
    int dolyaPiratov = (dobycha - dolyaBoss - dolyaKapitan) / piratov;

        System.out.println("Владельцу  " + dolyaBoss);
        System.out.println("Капитану  " + dolyaKapitan);
        System.out.println("Пирату каждому по  " + dolyaPiratov);
        System.out.println("");
        System.out.println("Второй вариант");

        //второй вариант
        int pirates = 45;
        int loot = 1745;
        int kazna = loot;

        int dolyaBossa = kazna / 2;
        kazna =  kazna - dolyaBossa;

        int dolyaKapa =  kazna / 2;
        kazna = kazna - dolyaKapa;

        int dolyaNaPiratov = kazna / (pirates + 1); //капитан получает еще долю как пират
        dolyaKapa = dolyaKapa + dolyaNaPiratov;
        kazna = kazna - dolyaNaPiratov * (pirates + 1);


        System.out.println("Владельцу  " + dolyaBossa);
        System.out.println("Капитану  " + dolyaKapa);
        System.out.println("Пирату каждому по  " + dolyaNaPiratov);
        System.out.println("Остаток  " + kazna);
        System.out.println("");

//как программа может проверить правильность дележа
        int proverka   = dolyaBossa + dolyaKapa + (dolyaNaPiratov * pirates) + kazna;
        System.out.println("Сравнение всех долей с количеством добычи  " + proverka);
        System.out.println(proverka == loot);

    }
}
