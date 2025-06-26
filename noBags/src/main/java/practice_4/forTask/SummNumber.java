package practice_4.forTask;

import java.util.Scanner;

public class SummNumber {

    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 0;


        //Проверим, что введенное число больше 1
        if (n < 1) {
            throw new IllegalArgumentException("Значение меньше 1!");

        } else {
            for (int i = 1; i <= n; i++) {
                result = result + i;
            }
            System.out.println("Результат: " + result);
        }
    }
}
