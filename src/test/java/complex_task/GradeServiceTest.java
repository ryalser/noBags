package complex_task;

import complex_task.task_3.GradeService;
import complex_task.task_3.StudentGrade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradeServiceTest {

    // Подготовка данных
    GradeService<Double> gradeService = new GradeService<>();

    StudentGrade<Double> grade1 = new StudentGrade<>("Math", "history",5.5);
    StudentGrade<Double> grade2 = new StudentGrade<>("Math", "history",9.5);;


    @Test
    void testAddGrade_Valid() {

        assertDoesNotThrow(() -> gradeService.addGrade(grade1));
    }

    @Test
    void testCalculateAvgValueGradesForSubject() throws Exception {

        gradeService.addGrade(grade1);
        gradeService.addGrade(grade2);

        double result = gradeService.calculateAvgValueGradesForSubject("Math");
        assertEquals(7.5, result);
    }

}


