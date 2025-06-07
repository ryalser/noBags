package practice_1;



public class MathOperations {

    // 1. Напишите класс MathOperations

    public static int add(int x,int y){
        return x + y;
    }


    public static int subtract(int x,int y){
        return x - y;
    }

    public static int multiply(int x,int y){
        return x * y;
    }


    public static double divide(int x,int y){
        return(double) x / y;
    }


    // 2. Реализуйте метод для нахождения максимума двух чисел
    public static int findMax(int x,int y){
        return Math.max(x,y);

    }

    // 3. Метод для нахождения разницы между двумя числами
    public static int difference (int x,int y){
        return Math.abs(x - y);
    }


    // 4. Методы для площади и периметра квадрата
    public static int squareArea(int side){
        return side * side;
    }
    public static int squarePerimeter(int side){
        return side * 4;
    }


    // 5. Метод для перевода секунд в минуты
    public static double convertSecondsToMinutes(int seconds){
        return(double) seconds / 60;
    }

    // 6. Метод для вычисления средней скорости
    public static double averageSpeed(double distance, double time) {
        if (time <= 0 ) {
            throw new IllegalArgumentException("Время должно быть положительным значением");
        }
            return distance / time;
        }




    // 7. Метод для нахождения гипотенузы
    public static double findHypotenuse(double a, double b){
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Аргументы метода не могут быть отрицательными!");
        }
            return Math.sqrt(a * a + b * b);
        }


    // 8. Метод для длины окружности
    public static double circleCircumference(double radius){
        return 2 * Math.PI * radius;
    }

    // 9. Метод для вычисления процентов
    public static double calculatePercentage(double total, double part){

        if (total <= 0) {
            throw new IllegalArgumentException("Число, от которого считаем процент не может быть = 0");
        }

        if (part < 0){
            throw new IllegalArgumentException("Часть не должна быть отрицательным значением");

        }
            return (part / total) * 100;
    }

    // 10. Методы перевода температуры
    public static double celsiusToFahrenheit(double c){
        return c * 9 / 5 + 32;
    }

    public static double fahrenheitToCelsius(double f){
        return (f - 32) * 5/9;
    }



    public static void main (String[] args){

        // 1. Напишите класс MathOperations с методами:
        System.out.println("Сумма чисел: " + add(1,5));
        System.out.println("Разница чисел: " + subtract(5,1));
        System.out.println("Произведение чисел: " + multiply(5,2));
        System.out.println("Деление чисел: " + divide(5,3));

        // 2. Реализуйте метод для нахождения максимума двух чисел
        System.out.println("Максимальное число: " + findMax(5,10));

        // 3. Метод для нахождения разницы между двумя числами
        System.out.println("Модуль разности чисел " + difference(5,10));

        // 4. Методы для площади и периметра квадрата
        System.out.println("Площадь квадрата: " + squareArea(5) + "\nПериметр квадрата: " + squarePerimeter(10));

        // 5. Метод для перевода секунд в минуты
        System.out.println("Количество минут: " + convertSecondsToMinutes(122));

        // 6. Метод для вычисления средней скорости
        System.out.println("Средняя скорость: " + averageSpeed(100,2));

        // 7. Метод для нахождения гипотенузы
        System.out.println("Гипотенуза: " + findHypotenuse(10,12));

        // 8. Метод для длины окружности
        System.out.println("Окружность: " + circleCircumference(10));

        // 9. Метод для вычисления процентов
        System.out.println("Процент от общего: " + calculatePercentage(10,-1));

        // 10. Методы перевода температуры

        double C = 10;
        double F = 50.0;

        System.out.println("Перевели в Фаренгейты " + celsiusToFahrenheit(C));
        System.out.println("Перевели в Цельсий " + fahrenheitToCelsius(F));









    }





}
