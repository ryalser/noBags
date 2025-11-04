package practice_4.whileTask;

import java.util.Scanner;

public class Factorial {


    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        int result = 1;
        int i = 1;


        if (n > 0) {
            while (i <= n) {
                result = result * i;
                i++;
            }

            System.out.println("Произведение всех чисел от 1 до " + n + " ,будет равно: " + result);

        } else {
            throw new IllegalArgumentException("Введите число больше 0!");
        }


        }



    }



