package practice_10;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 *Тесты:
 * [ "Java", "C", "Python" ] → [ "C", "Java", "Python" ]
 * Одинаковые длины ([ "aa", "bb", "cc" ])
 * Пустой список
 */

public class Task_12_Test {

    private final Task_12 task12 = new Task_12();


    @Test
    @DisplayName("Обычный список для сортировки в методе sortByLength()")
    void checkRegularList() {
        List <String> list = List.of("Java", "C", "Python");
        assertEquals(List.of("C", "Java", "Python"),task12.sortByLength(list),
                "Корректная сортировка: \"C\", \"Java\", \"Python\"");
    }


    @Test
    @DisplayName("Строки одной длины для сортировки в методе sortByLength()")
    void checkEqualLengths() {
        List <String> list = List.of("aa", "bb", "cc" );
        assertEquals(list,task12.sortByLength(List.of("aa", "bb", "cc")));
    }


    @Test
    @DisplayName("Пустой список для сортировки в методе sortByLength()")
    void checkEmptyList() {
        assertEquals(List.of(),task12.sortByLength(List.of()));
    }
}
