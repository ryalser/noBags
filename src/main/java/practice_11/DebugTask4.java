package practice_11;

/**
 * Код должен проверить, является ли строка палиндромом, но выбрасывает NullPointerException.
 */

public class DebugTask4 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(null));
    }
    public static boolean isPalindrome(String str) {

        if (str == null){
            /**
             * В метод явно передается null.
             * Поэтому выбрасываем исключение:
             * throw new NullPointerException("Строка не должна быть равно null");
             * Либо возвращаем false по умолчанию.
             */
            return false;
        }
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
