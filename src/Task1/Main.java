package Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Привет, напишите положительное число ");
        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();
        try {
            pozitiveNumbers(numb);
            System.out.println("Число" +" - " + numb + " " + "корректное");
        } catch (InvalidNumberException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static void pozitiveNumbers(int numb) throws InvalidNumberException {
        if (numb <= 0) {
            throw new InvalidNumberException (numb + " - " + "некорректное число");
        }
    }
}