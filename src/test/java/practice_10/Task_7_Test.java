package practice_10;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Тесты должны проверять:
 * 0! = 1
 * Маленькие числа (1!, 5!, 7!)
 * Отрицательные числа (должно выбрасываться исключение)
 */

public class Task_7_Test {

    private final Task_7 task7 = new Task_7();


    @Test
    @DisplayName("Факториал 0 в методе factorial()")
    void checkFactorialNumZero(){
        assertEquals(1,task7.factorial(0),
                "Факториал 0 будет равен 1");
    }


    @Test
    @DisplayName("Маленькие числа в методе factorial()")
    void checkSmallNumbers (){
        assertEquals(120,task7.factorial(5),
                "Факториал 5 будет равен 120");
    }


    @Test
    @DisplayName("Отрицательные числа в методе factorial()")
    void checkNegativeNumbers(){
        Exception exception = assertThrows(IllegalArgumentException.class,() ->
                task7.factorial(-10));
        assertEquals("Negative numbers not allowed",exception.getMessage());
    }
}
