package practice_4.doWhileTask;

import java.util.Scanner;

public class QuantityNumber {
    public static void main(String[] args) {



       System.out.println("Введите число: ");
       Scanner scanner = new Scanner(System.in);
        int youNumber = scanner.nextInt();
        int count = 0;

        if (youNumber <= 0){
            throw new IllegalArgumentException("Укажите число больше 0!");
        } else {
            do {
                youNumber = youNumber / 10;
                count++;
            } while (youNumber != 0);

            System.out.println("Количество цифр: " + count);
        }


    }
}
