package practice_4.ifElseTask;

import java.util.Scanner;

public class MaxNumber {

    public static void main(String[] args) {

        System.out.println("Введите первое число: ");
        Scanner scanner1 = new Scanner(System.in);
        int number_1 = scanner1.nextInt();

        System.out.println("Введите второе число: ");
        Scanner scanner2 = new Scanner(System.in);
        int number_2 = scanner2.nextInt();


        // if-else
        if (number_1 > number_2){
            System.out.println("Максимальное значение: " + number_1);
        }else if (number_2 > number_1){
            System.out.println("Максимальное значение: " + number_2);
        } else {
            System.out.println("Оба указанных значения равны: " + number_1);
        }

        //Math.max()
        int maxValue = Math.max(number_1,number_2);
        System.out.println("Максимальное значение: " + maxValue);

    }

}
