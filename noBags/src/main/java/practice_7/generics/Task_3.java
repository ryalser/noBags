package practice_7.generics;

public class Task_3 {

    public static void main(String[] args) {

        // создаем экземпляр Pair с двумя типами для имени и возраста
        Pair <String, Integer> pair = new Pair<>();

        // устанавливаем значения
        pair.setFirst("Строка");
        pair.setSecond(25);

        // выводим информацию
        System.out.println("Выводим наши значения, first: " + pair.getfirst() + " ,second: " + pair.getSecond());



    }

}


// класс работает с объектами разного типа данных
class Pair <T, U> {

    // переменные хранят данные разного типа
    private T first;
    private U second;


    // сеттер для first
    public void setFirst(T first) {
        this.first = first;
    }

    // сеттер для second
    public void setSecond(U second) {
        this.second = second;
    }

    // геттер для first
    public T getfirst() {
        return first;
    }

    // геттер для second
    public U getSecond() {
        return second;
    }
}
