package practice_4.switchTask;

import java.util.Scanner;

public class TranslationOfGrades {
    public static void main(String[] args) {


        System.out.println("Введите баллы - от 0 до 100: ");
        Scanner scanner = new Scanner(System.in);
        int youGrade = scanner.nextInt();
        String yourLetterGrade = "F";

        if (youGrade < 0 || youGrade > 100){
            throw new IllegalArgumentException("Некорректно передано значение!");
        } else if (youGrade >= 60 &&  youGrade <= 69){
            yourLetterGrade = "D";
        } else if (youGrade >= 70 && youGrade <= 79){
            yourLetterGrade = "C";
        } else if (youGrade >= 80 && youGrade <= 89){
            yourLetterGrade  = "B";
        } else if (youGrade >= 90 && youGrade <= 100){
            yourLetterGrade = "A";
        }
        System.out.println("Ваша буквенная оценка: " + yourLetterGrade);






    }


}
