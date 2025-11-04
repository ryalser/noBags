package practice_8.streamapi_baseoperation;

import java.util.List;
import java.util.stream.Collectors;

public class Task_4 {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,2,3,4,5);

        List<Integer> squareNumber = numbers.stream()
                .map(num -> num * num)
                .collect(Collectors.toList());

        System.out.println(squareNumber);
    }
}
