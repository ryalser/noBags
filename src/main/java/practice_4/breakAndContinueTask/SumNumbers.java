package practice_4.breakAndContinueTask;

import java.util.Scanner;

public class SumNumbers {

    public static void main(String[] args) {


        int sum = 0;

        System.out.println("Введите первое число:");
        Scanner scanner1 = new Scanner(System.in);
        int number = scanner1.nextInt();

        System.out.println("Введите второе число:");
        Scanner scanner2 = new Scanner(System.in);
        int number2 = scanner2.nextInt();

        while (number >= 0 && number2 >= 0){
            sum = number2 + number;
            System.out.println("Сумма: " + sum);
            break;
        }





    }
}
