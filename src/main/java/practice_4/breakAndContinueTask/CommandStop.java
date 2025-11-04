package practice_4.breakAndContinueTask;

import java.util.Scanner;

public class CommandStop {
    public static void main(String[] args) {

        String commandStop = "stop";
        String youCommand;


            while (true){

                System.out.println("Введите команду stop!");
                Scanner scanner = new Scanner(System.in);
                youCommand = scanner.nextLine();

                if (youCommand.equals(commandStop)){
                    System.out.println("Завершаем программу!");
                    break;
                }
            }

    }
}
