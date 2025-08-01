package practice_7.exception;

public class DivisionByZero {

    public static void main(String[] args) {



        int num = 10;
        int result;


        try {
            result = num / 0;

            // если вычисление выполнится, выведем результат
            System.out.println(result);

            // ловим исключение
        } catch (ArithmeticException e){

            // выводим сообщение при исключении
            System.out.println("Делить на ноль нельзя!");
        }

    }
}
