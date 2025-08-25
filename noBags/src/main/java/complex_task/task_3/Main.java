package complex_task.task_3;

public class Main {
    public static void main(String[] args) throws InvalidGradeException {

        System.out.println("Начало...");

        try {
            // Чтобы обратиться к методам, создаем экземпляр класса GradeService
            GradeService gradeService_History = new GradeService();

            // Передаем в метод addGrade объекты типа StudentGrade
            gradeService_History.addGrade(new StudentGrade("Ivan","History",9));
            gradeService_History.addGrade(new StudentGrade("Petr","History",10));
            gradeService_History.addGrade(new StudentGrade("Anna","History",20));

            // Указываем предмет для расчета
            gradeService_History.calculateAvgValueGradesForSubject("History");



            GradeService gradeService_Biology = new GradeService();
            gradeService_Biology.addGrade(new StudentGrade("Ivan","Biology",4));
            gradeService_Biology.addGrade(new StudentGrade("Petr","Biology",5.5));
            gradeService_Biology.addGrade(new StudentGrade("Anna","Biology",5.5));


            gradeService_Biology.calculateAvgValueGradesForSubject("Biology");

            System.out.println("Подсчет средних баллов по предметам завершен.");


        } catch (InvalidGradeException e){

            throw new InvalidGradeException(e.getMessage());
        }
    }

}
