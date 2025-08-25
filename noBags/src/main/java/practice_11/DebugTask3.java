package practice_11;

/**
 * Код должен напечатать числа от 1 до 5, но программа зависает.
 */

public class DebugTask3 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.println("Number: " + i);
            i++;

            // Не хватает условия i++
            // i всегда равно i, следовательно, условие i <= 5 всегда истинно
        }
    }
}
