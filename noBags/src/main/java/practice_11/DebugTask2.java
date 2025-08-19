package practice_11;

/**
 * Код должен вычислить сумму чисел от 1 до 5, но почему-то результат неправильный.
 */

public class DebugTask2 {
    public static void main(String[] args) {
        int sum = calculateSum(5);
        System.out.println("Sum: " + sum);
    }
    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) { // i-- заменили на i++, иначе цикл бесконечно уменьшается на 1
            sum += i;
          System.out.println(sum);
            /**
             * 1-я итерация sum = 1
             * 2-я итерация sum = 3
             * 3-я итерация sum = 6
             * 4-я итерация sum = 10
             * 5-я итерация sum = 15
             */
        }
        return sum;
    }
}
