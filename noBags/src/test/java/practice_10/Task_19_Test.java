package practice_10;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Тесты:
 * "{"key":"value"}" → true
 * "invalid json" → false
 * null → false
 */

public class Task_19_Test {

    private final Task_19 task19 = new Task_19();


    @Test
    @DisplayName("Валидный JSON для валидации в методе isValidJson()")
    void checkValidJSON() {
        assertTrue(task19.isValidJson("{\"key\":\"value\"}"));
    }


    @Test
    @DisplayName("Невалидный JSON в методе isValidJson()")
    void checkInvalidJSON() {
        assertFalse(task19.isValidJson("invalid json"));
    }


    @Test
    @DisplayName("JSON не передан в методе isValidJson()")
    void checkNULLJson() {
        assertFalse(task19.isValidJson(null));
    }
}
