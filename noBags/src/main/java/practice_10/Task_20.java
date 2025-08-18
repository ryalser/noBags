package practice_10;

import java.util.Arrays;

public class Task_20 {

    public boolean hasDuplicates(int[] numbers) {
        return Arrays.stream(numbers).distinct().count() != numbers.length;
    }
}
