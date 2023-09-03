package Task2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Напишите первое число ");
        int numb1 = sc.nextInt();
        System.out.println("Напишите второе число");
        int numb2 = sc.nextInt();
        try {
            int res = divisionTwoNumbers(numb1, numb2);
            System.out.println("Деление первого числа на второе" + "=" + res);
            } catch (DivisionByZeroException ex){
            System.out.println(ex.getMessage());
        }

    }
    public static int divisionTwoNumbers(int numb1, int numb2) throws DivisionByZeroException{
        if(numb2 ==0){
            throw  new DivisionByZeroException("Деление на ноль недопустимо");
        }
        return numb1/numb2;
    }
}
