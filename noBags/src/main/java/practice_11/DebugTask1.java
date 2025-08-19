package practice_11;

/**
 * Код должен напечатать все элементы массива, но вместо этого выбрасывает исключение.
 */

public class DebugTask1 {
    public static void main(String[] args) {
            int[] numbers = {10, 20, 30, 40, 50};
            // Проблема была в numbers.length -> заменим на numbers.length-1
            // Чтобы не обращались к индексу, которого нет
            for (int i = 0; i <= numbers.length-1; i++) {
                System.out.println(numbers[i]);
            }
        }
    }

