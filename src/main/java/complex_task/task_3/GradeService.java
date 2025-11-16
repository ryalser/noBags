package complex_task.task_3;

import java.util.ArrayList;
import java.util.List;

public class GradeService<T extends Number> {

    // Список объектов класса StudentGrade
    List<StudentGrade<T>> grades = new ArrayList<>();

    // Добавить оценку
    public synchronized void addGrade(StudentGrade grade) throws InvalidGradeException {
        if (grade.getGrade().doubleValue() < 0) {
            throw new InvalidGradeException("Оценка не может быть отрицательной!");
        }
        grades.add(grade);
    }

    // Рассчитать средние значения оценок по конкретному предмету
    public double calculateAvgValueGradesForSubject(String subject) {

        // Хранит расчет средней оценки по предмету
        double avgForSubject = 0;
        // Счетчик оценок по нужному предмету
        int countForSubject = 0;
        System.out.println("Начинаем расчет средней оценки...");

        for (StudentGrade grade : grades) {
            // Проверяем, что оценка относится к нужному предмету
            if (grade.getSubject().equals(subject)) {
                avgForSubject += grade.getGrade().doubleValue();// получаем все оценки по предмету subject
                countForSubject++; // Увеличиваем счетчик оценок по предмету
            }
        }

        // Проверяем, чтобы не делить на 0
        if (countForSubject == 0) {
            System.out.println("По предмету " + subject + " нет оценок");
            return 0.0;
        }

        System.out.println("Средние оценки по предмету " + subject + " : " + avgForSubject / countForSubject);

        return avgForSubject / countForSubject; // Делим на количество оценок по предмету
    }
}

