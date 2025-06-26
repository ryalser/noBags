package practice_4.forTask;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        boolean isPrime = true;

        if (n < 2) {
            isPrime = false;
        } else {

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

            System.out.println("Число простое? Ответ: " + isPrime);

        }



    }




