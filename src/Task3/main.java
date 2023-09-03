package Task3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Напишите первое число ");
        int numb1 = sc.nextInt();
        System.out.printf("напишите второе число ");
        int numb2 = sc.nextInt();
        System.out.printf("Напишите третье число ");
        int numb3 = sc.nextInt();
        try {
            errorChecking(numb1,numb2,numb3);
            System.out.println("Проверка пройдена успешно");
        } catch (NumberOutOfRangeException | NumberSumException | DivisionByZeroException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void errorChecking(int numb1, int numb2, int numb3) throws NumberOutOfRangeException, NumberSumException, DivisionByZeroException{
        if(numb1 > 100){
            throw new NumberOutOfRangeException("Первое число вне допустимого диапазона");
        }
        if (numb2<0){
            throw new NumberOutOfRangeException("Второе число вне допустимого диапазона");
        }
        if(numb1+numb2<10){
            throw new NumberSumException("Сумма первого и второго чисел слишком мала");
        }
        if(numb3==0){
            throw  new DivisionByZeroException("Деление на ноль недопустимо");
        }
    }

}
