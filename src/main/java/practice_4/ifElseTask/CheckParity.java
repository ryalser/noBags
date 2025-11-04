package practice_4.ifElseTask;

import java.util.Scanner;

public class CheckParity {


    public static void main(String[] args) {


        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        String checkResult = "Число нечетное!";

        if (number % 2 == 0){
            checkResult = "Число четное!";
            System.out.println(checkResult);
        }else {
            System.out.println(checkResult);
        }
    }
}
