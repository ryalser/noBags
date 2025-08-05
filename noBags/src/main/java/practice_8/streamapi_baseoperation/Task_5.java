package practice_8.streamapi_baseoperation;

import java.util.List;
import java.util.stream.Collectors;

public class Task_5 {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,2,2,3,3,4,5);

        List<Integer> notDuplicates = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(notDuplicates);
    }
}
