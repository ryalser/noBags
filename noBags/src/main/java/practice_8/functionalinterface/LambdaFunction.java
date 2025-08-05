package practice_8.functionalinterface;

import java.util.function.Function;

public class LambdaFunction {

    public static void main(String[] args) {

        // принимает String и возвращает его размер в Integer
        Function <String,Integer>  stringFunction = str -> str.length();


        System.out.println("Размер строки " + stringFunction.apply("Привет!") + " символов.");


    }
}
