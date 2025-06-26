package practice_4.breakAndContinueTask;

import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {


        int count = 1;
        do {
            System.out.println("Введите число!");
            Scanner scanner = new Scanner(System.in);
            int yourNumber = scanner.nextInt();

            if (yourNumber < 0){
                continue;
            } else {
                System.out.println(yourNumber);
            }

            count++;


          //количество чисел, которые можно ввести
        } while (count <= 3);
    }
}

