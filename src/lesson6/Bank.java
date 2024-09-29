package lesson6;

public class Bank {
    public static void main(String[] args) {

        Account checkin = new Account();
        checkin.balance = 0;

        checkin.balance = checkin.balance + 100;
        System.out.println(checkin.balance);

        checkin.debit(20);
        System.out.println(checkin.balance);

        checkin.debit(170);
        System.out.println(checkin.balance);
    }
}
