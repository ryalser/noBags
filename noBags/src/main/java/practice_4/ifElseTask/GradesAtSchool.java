package practice_4.ifElseTask;

import java.util.Scanner;

public class GradesAtSchool {


    public static void main(String[] args) {

        System.out.println("Введите оценку: ");
        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();

        if (grade == 5){
            System.out.println("Отлично");
        } else if (grade == 4){
            System.out.println("Хорошо");
        } else if (grade == 3){
            System.out.println("Удовлетворительно");
        } else if (grade == 2 || grade == 1) {
            System.out.println("Неудовлетворительно");
        } else {
            System.out.println("Оценка введена некорректно!");
        }


    }


}
