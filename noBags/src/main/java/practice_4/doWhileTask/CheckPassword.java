package practice_4.doWhileTask;

import java.util.Scanner;

public class CheckPassword {

    public static void main(String[] args) {


        String password = "123ABC";
        String youPassword;

        do {
            System.out.println("Введите пароль!");
            Scanner scanner = new Scanner(System.in);
            youPassword = scanner.nextLine();
        } while (!youPassword.equals(password));

        System.out.println("Добро пожаловать!");
    }
}
