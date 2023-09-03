package Task4;

import java.util.Scanner;

public class Bank implements Runnable{
    BankAccount account;
    public Scanner sc;

    public Bank(int cash, Scanner sc) {
        account = new BankAccount(cash);
        this.sc = sc;
    }

    public int depositingMoney(int cash) throws MaxBalanceExceededException {
        account.depositingMoney(cash);

        return account.getBankCount();
    }

    public int cashWithdrawal(int cash) throws InsufficientFundsException {
        account.cashWithdrawal(cash);
        return account.getBankCount();
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Пополнение счета в рамере = ");
        int cash = sc.nextInt();
        int balance = 0;
        try {
            balance = depositingMoney(cash);
        } catch (MaxBalanceExceededException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Текуший баланс составляет "+ balance);
        System.out.printf("Снятие со счета в рамере = ");
        cash = sc.nextInt();
        try {
            balance = cashWithdrawal(cash);
        }catch (InsufficientFundsException ex){
            throw new RuntimeException(ex);
        }
        System.out.println("Текуший баланс составляет "+ balance);
    }
}
