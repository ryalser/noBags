package practice_4.switchTask;

import java.util.Scanner;

public class TextCommands {


    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();


        switch (command){
            case "start":
                System.out.println("Система запущена!");
                break;
            case "stop":
                System.out.println("Система остановлена!");
                break;
            case "restart":
                System.out.println("Система перезапущена!");
                break;
            case "status":
                System.out.println("Получаем данные!");
                break;

            default:
                System.out.println("Некорректная команда!");


        }
    }

}
