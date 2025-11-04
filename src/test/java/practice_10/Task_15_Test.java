package practice_10;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

/**
 * Тесты:
 * [ "Java", "C++", "Go" ] → [ 4, 3, 2 ]
 * Пустой список
 */

public class Task_15_Test {


    private final Task_15 task15 = new Task_15();


    @Test
    @DisplayName("Валидные данные в метод определения длины строк mapToLengths()")
    void checkListStrings() {
        List<Integer> expect = List.of(4,3,2);
        assertEquals(expect,task15.mapToLengths(List.of("Java", "C++", "Go" )),
                "Верный ответ: 4,3,2");
    }


    @Test
    @DisplayName("Пустой список в метод определения длины строк mapToLengths()")
        void checkEmptyList() {
        assertEquals(List.of(),task15.mapToLengths(List.of()));
        }

}
