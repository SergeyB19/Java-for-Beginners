package lesson4;

public class BankAccount {
    int id = 10;
    String name = "Petr";

    double balance = 100;

    double popolnenieScheta(double max) {
        balance += max;
        return balance;
    }

    double snyatieSoScheta(double min) {
        balance -= min;
        return balance;
    }


}


class BankAccountTest {
    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();


        MyAccount.id = 1;
        MyAccount.name = "Zaur";
        MyAccount.balance = 12.35;
        MyAccount.popolnenieScheta(190.0);

        YourAccount.id = 2;
        YourAccount.name = "Mike";
        YourAccount.balance = 2.00;

        HisAccount.id = 3;
        HisAccount.name = "Ivan";
        HisAccount.balance = 124.12;

        System.out.println(YourAccount.name);
        System.out.println(MyAccount.name);
        System.out.println(MyAccount.balance);

    }
}
