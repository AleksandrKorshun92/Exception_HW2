package Task4;

import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите изначальный баланс = ");
        int balance = sc.nextInt();

        Bank bank = new Bank(balance, sc);

        Thread bankThread = new Thread(bank);
        bankThread.start();

    }

}




