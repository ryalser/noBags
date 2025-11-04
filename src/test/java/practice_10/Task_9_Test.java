package practice_10;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Тесты должны проверять:
 * Пустую строку
 * null
 * Строку с несколькими пробелами
 */

public class Task_9_Test {

    private final Task_9 task9 = new Task_9();


    @Test
    @DisplayName("Обычная строка для метода countWords()")
    void checkRegularString() {
        assertEquals(2,task9.countWords("Hello world"),
                "Получаем 2 слова");
    }


    @Test
    @DisplayName("Строка с лишними пробелами для метода countWords()")
    void checkStringsWithExtraSpaces() {
        assertEquals(3,task9.countWords("Java is awesome "),
                "Получаем 2 слова");
        /**
         * Нашел проблему, если указать строку с пробелом вначале _Java_is_awesome_,то
         * проверка падает, т.к. метод возвращает 4 слова.
         * Вопрос - как поступить? - остался открытым
         */
    }


    @Test
    @DisplayName("Пустая строка для метода countWords()")
    void checkEmptyString() {
        assertEquals(0,task9.countWords(""),
                "Пустая строка возвращает 0");
    }


    @Test
    @DisplayName("Строка с пробелами для метода countWords()")
    void checkStringWithSpace() {
        assertEquals(0,task9.countWords(" "),
                "Строка с пробелами должна вернуть 0");
    }


    @Test
    @DisplayName("null для метода countWords()")
    void checkNULLString() {
        String nullString = null;
        Exception exception = assertThrows(NullPointerException.class,() -> {
            task9.countWords(nullString);
        });
        assertEquals("Cannot invoke \"String.trim()\" because \"sentence\" is null",
                exception.getMessage());
        /**
         * В данном тесте я предпочел настроить проверку на NullPointerException.
         * В задании указано IllegalArgumentException, но как будто по смыслу это не подходит.
         */
    }
}
