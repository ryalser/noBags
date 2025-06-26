package practice_4.doWhileTask;

import java.util.Scanner;

public class RequestPositiveNumber {

    public static void main(String[] args) {

        int number;

        do {
            System.out.println("Введите положительное число!");
            Scanner scanner = new Scanner(System.in);
            number = scanner.nextInt();

        } while (number <= 0);


    }



}
