package practice_10;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.util.Arrays;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.stream.Collectors;

/**
 * "Java,Python,C++", "," → ["Java", "Python", "C++"]
 * "", "," → [""]
 * "word", "," → ["word"]
 */

public class Task_16_Test {

    private final Task_16 task16 = new Task_16();


    @Test
    @DisplayName("Строка + разделитель в методе splitString()")
    void checkTwoString() {
        // Ожидаем результат
        assertEquals(List.of("Java", "Python", "C++"),
                // Передаем аргументы
                Arrays.stream(task16.splitString("Java,Python,C++", ","))
                        // Собираем в коллекцию результат метода
                        .collect(Collectors.toList()),
                "Ожидаемый результат: \"Java\", \"Python\", \"C++\"");
    }


    @Test
    @DisplayName("Пустая строка + разделитель в методе splitString()")
    void checkEmptyStringPlusSeparator() {
        // Ожидаем результат
        assertEquals(List.of(""),
                // Передаем аргументы
                Arrays.stream(task16.splitString("", ","))
                        // Собираем в коллекцию результат метода
                        .collect(Collectors.toList()),
                "[\"\"]");
    }


    @Test
    @DisplayName("Одно слово + разделитель в методе splitString()")
    void checkOneStringPlusSeparator() {
        // Ожидаем результат
        assertEquals(List.of("word"),
                // Передаем аргументы
                Arrays.stream(task16.splitString("word", ","))
                        // Собираем в коллекцию результат метода
                        .collect(Collectors.toList()),
                "[word]");
    }
}



