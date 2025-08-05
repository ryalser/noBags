package practice_8.functionalinterface;

import java.util.function.Consumer;

public class LambdaConsumer {

    public static void main(String[] args) {

        // принимает строку и выводим в консоль
        Consumer <String> stringConsumer = str -> System.out.println(str);


        // вызываем метод accept и передаем аргумент - строку
        stringConsumer.accept("Hello world!");
    }
}
