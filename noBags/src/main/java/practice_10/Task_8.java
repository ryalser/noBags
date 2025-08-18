package practice_10;

import java.util.Arrays;

public class Task_8 {

    public int findSecondMax(int[] numbers) {
        return Arrays.stream(numbers)
                .distinct()
                .sorted()
                .skip(numbers.length - 2)
                .findFirst()
                .orElseThrow();
    }
}
