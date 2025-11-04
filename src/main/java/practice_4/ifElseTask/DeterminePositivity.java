package practice_4.ifElseTask;

import java.util.Scanner;

public class DeterminePositivity {

    public static void main(String[] args) {


        System.out.println("Введите номер/число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();


        if (number < 0){
            System.out.println("Число отрицательное!");
        } else if (number > 0){
            System.out.println("Число положительное!");
        } else {
            System.out.println("Число/номер равен нулю!");
        }

    }


}
