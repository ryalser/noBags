package practice_11;

/**
 *  Код должен сравнить два числа, но почему-то результат не соответствует ожиданиям.
 */

public class DebugTask8 {
    public static void main(String[] args) {
        double a = 0.1 * 3;
        double b = 0.3;

        /**
         * Под дебагом a = 0.30000000000000004, b = 0.3
         * Т.к. для примитивов не используется Equals я привел в условном операторе их к типу int
         */

        if ((int)a == (int)b) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
