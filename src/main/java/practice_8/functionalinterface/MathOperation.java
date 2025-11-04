package practice_8.functionalinterface;



// функциональный интерфейс с 1 методом
@FunctionalInterface
public interface MathOperation {
    double result (double a, double b);
}


 class Main {
    public static void main(String[] args) {

        // создаем объект типа MathOperation и указываем лямбда-выражения
        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (a, b) -> a * b;
        MathOperation division = (a, b) -> a / b;




        // выводим результат, обращаясь к объекту и далее вызывая метод интерфейса
        System.out.println("Сложение двух чисел: " + addition.result(5,5));
        System.out.println("Вычитание двух чисел: " + subtraction.result(5,5));
        System.out.println("Умножение двух чисел: " + multiplication.result(5,5));
        System.out.println("Деление двух чисел: " + division.result(5,5));

    }

}
