package practice_11;

/**
 *  Код должен напечатать числа от n до 1, но программа падает с StackOverflowError.
 */

public class DebugTask6 {
    public static void main(String[] args) {
        countdown(5);
    }
    public static void countdown(int n) {
        for (int i = n; i >= 1; i--)
            System.out.println(i);
    }

    /**
     *  Убрал рекурсию в методе: countdown(n - 1);
     *  Вызов самого себя с постоянным уменьшение аргумента идет бесконечно и прога падает.
     *  Выбрал цикл как оптимальное решение.
     */
}
