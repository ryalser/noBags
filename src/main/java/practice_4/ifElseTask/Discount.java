package practice_4.ifElseTask;

import java.util.Scanner;

public class Discount {


    public static void main(String[] args) {


        System.out.println("Введите возраст: ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        // размер скидки
        int discount25 = 25;
        int discount30 = 30;



        if ( age > 0 && age < 18){
            System.out.println("Размер скидки: " + discount25);
        } else if (age >= 65){
            System.out.println("Размер скидки: " + discount30);
        }else {
            System.out.println("Скидка не применима!");
        }


    }
}
