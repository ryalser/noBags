package practice_4.ifElseTask;

import java.util.Scanner;

public class TestResult {


    public static void main(String[] args) {
        System.out.println("Введите результат тест в баллах: ");
        Scanner scanner = new Scanner(System.in);
        int testResult = scanner.nextInt();

        if (testResult >= 90 && testResult <= 100){
            System.out.println("Результат: Отлично");
        } else if(testResult >= 75 && testResult < 89){
            System.out.println("Результат: Хорошо");
        } else if (testResult >= 60 && testResult < 74){
            System.out.println("Результат: Удовлетворительно");
        }else if (testResult < 60 && testResult >=0) {
            System.out.println("Результат: Неудовлетворительно");
        } else {
            System.out.println("Результат указан некорректно!");

        }


    }


}
