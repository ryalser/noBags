package practice_4.whileTask;

import java.util.Scanner;

public class Countdown {

    public static void main(String[] args) {

        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int countdown = n;

        if (n > 0){
            while (countdown >= 1){
                System.out.println(countdown);
                countdown -= 1;
            }
        } else {
            throw new IllegalArgumentException("Вы указали некорректное значение!");
        }



    }
}
