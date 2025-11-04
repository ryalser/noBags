package practice_7.generics;

public class Task_2 {

    // метод принимает массив с любым типом данных
    public static <T> void printArray (T[] newArray){

        // перебираем элементы с помощью цикла for-each
        for (T valueArray : newArray ){
            System.out.println(valueArray);
        }
    }



    public static void main(String[] args) {

        // создаем массивы с разным типом данных
        String[] arrayString = {"Строка_1", "Строка_2", "Строка_3", "Строка_4"};
        Integer[] arrayInteger = {1,2,3,4};


        // передаем массив методу и выводим в консоль
        System.out.println("Выводим массив с типом String:");
        printArray(arrayString);


        System.out.println("Выводим массив с типом Integer:");
        printArray(arrayInteger);
    }
}
