package practice_10;

import java.util.Arrays;

public class Task_14 {

    public double findAverage(int[] numbers) {
        return Arrays.stream(numbers).average().orElseThrow();
    }
}
