package practice_10;

import java.util.Arrays;

public class Task_4 {
    public int findMax(int[] numbers) {
        return Arrays.stream(numbers).max().orElseThrow();
    }
}
