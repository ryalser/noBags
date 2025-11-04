package practice_4.switchTask;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        //Вводим первое число
        System.out.println("Введите первое число: ");
        Scanner scanner = new Scanner(System.in);
        double number1 = scanner.nextDouble();

        //Вводим второе число
        System.out.println("Введите первое число: ");
        Scanner scanner2 = new Scanner(System.in);
        double number2 = scanner.nextDouble();

        //Вводим оператор
        System.out.println("Введите операцию, которую хотите выполните: ");
        Scanner scanner3 = new Scanner(System.in);
        String operator = scanner3.nextLine();
        double result;


        switch (operator){

            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                if (number2 == 0){
                    throw new ArithmeticException("На 0 делить нельзя!");
                } else {
                    result = number1 / number2;
                }
                break;

            default:
                throw new ArithmeticException("Указан неверный оператор!");

        }

        System.out.println("Результат вычислений: " + result);



    }
}
