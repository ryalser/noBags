package practice_4.doWhileTask;

import java.util.Scanner;

public class CommandExit {

    public static void main(String[] args) {

        String commandExit = "exit";
        String youCommand;
        do {
            System.out.println("Введите команду!");
            Scanner scanner = new Scanner(System.in);
            youCommand = scanner.nextLine();
        } while (!youCommand.equals(commandExit));
        System.out.println("Программа завершена!");
    }
}
