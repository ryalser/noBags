package practice_4.forTask;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {


        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        //Проверим введенное число | немного ограничим для простоты
        if (n < 0 || n > 10){
            throw new IllegalArgumentException("Введите число от 0 до 10");
        } else {
            for (int i = 0; i <= 10;i++){
                System.out.println("Результат умножения " + n + " на " + i + " = " + n*i);
            }
        }





    }




}
