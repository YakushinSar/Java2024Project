package lesson6;

public class Account {

    double balance;

    public void debit(double amount) {
        if (balance < amount) {
            System.out.println("снять нельзя больше чем " + balance);
        } else {
            balance = balance - amount;

        }

    }}