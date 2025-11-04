package practice_8.streamapi_baseoperation;

import java.util.List;
import java.util.stream.Collectors;

public class Task_2 {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,2,3,4,5,10,15);

        List<Integer> filterNumbers = numbers.stream()
                .filter(x -> x % 5 == 0)
                .collect(Collectors.toList());

        System.out.println(filterNumbers);
    }
}
