package practice_8.functionalinterface;

import java.util.function.Predicate;

public class LambdaPredicate {


    public static void main(String[] args) {
        // прописываем условие проверки для входящего параметра, будет возвращать true или false
        Predicate <Integer> isEvenNumber = x -> x % 2 == 0;

        // вызываем isEvenNumber и передаем число для проверки
        System.out.print("Будет ли число четным: ");
        System.out.print(isEvenNumber.test(6));
    }




}
