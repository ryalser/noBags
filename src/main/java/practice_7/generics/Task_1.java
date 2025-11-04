package practice_7.generics;

public class Task_1 {

    public static void main(String[] args) {

        // создаем экземпляр класса и добавляем значение типа Integer
        Box <Integer> integerBox = new Box<>();
        integerBox.setValue(10);
        System.out.println("Записали целое число: " + integerBox.getValue());

        // создаем экземпляр класса и добавляем значение типа String
        Box <String> stringBox = new Box<>();
        stringBox.setValue("12345qwerty");
        System.out.println("Записали новую строку: " + stringBox.getValue());

    }


}


class Box <T>{

    // будем хранить здесь данные любого типа
    private T value;

    // сеттер
    public void setValue(T newValue){
        this.value = newValue;
    }

    // геттер
    public T getValue (){
        return this.value;
    }

}