package practice_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


/**
 *  Код должен удалять элементы списка, но выбрасывает ConcurrentModificationException.
 */

public class DebugTask10 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) { // Пока есть элементы цикл повторяем
            String name = iterator.next(); // Каждый элемент коллекции пишем переменную
                if (name.startsWith("A")) {
                   iterator.remove();
                   // Если начинается на "А", то методом итератора (remove()) удалим этот name
                }
            }

        System.out.println(names); // Уже измененная коллекция

        /**
         *  Пришлось много гуглить описание исключения и синтаксис итератора.
         *  Это единственный вариант который я смог сделать в итоге
         */
    }
}

