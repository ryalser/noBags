package practice_4.whileTask;

import java.util.Scanner;

public class EvenNumbers {

    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int i = 1;

        while (i <= n){

            if (i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
    }
}
