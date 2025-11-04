package practice_10;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Task_3_Test {

    private final Task_3 task3 = new Task_3();


    @Test
    @DisplayName("Обычные строки в метод reverse()")
    void checkRegularLines(){
        String expectedValue = "54321";
        assertEquals(expectedValue, task3.reverse("12345"),"Должно вернуться 54321");
    }

    @Test
    @DisplayName("Пустую строку в метод reverse()")
    void checkEmptyLine(){
        assertEquals("", task3.reverse(""),"Должна вернуться пустая строка");
    }

    @Test
    @DisplayName("null в метод reverse()")
    void checkNullValue(){
        assertNull(task3.reverse(null),"Должен вернуть NULL");
    }
}
