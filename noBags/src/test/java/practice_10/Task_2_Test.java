package practice_10;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Task_2_Test {

    private final Task_2 task2 = new Task_2();


    @Test
    @DisplayName("Разные строки для метода countVowels()")
    void checkDifferentStrings(){
        int count = task2.countVowels("java");
        assertEquals(2,count,"В строке \"java\" 2 гласных");
    }


    @Test
    @DisplayName("Строки без гласных для метода countVowels()")
    void checkLinesWithoutVowels(){
        assertEquals(0,task2.countVowels(""),"Пустая строка вернет 0 в методе");
    }



}
