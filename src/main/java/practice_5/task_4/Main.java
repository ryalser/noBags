package practice_5.task_4;

public class Main {

    public static void main(String[] args) {

        //создаем аквариум
        Aquarium aquarium = new Aquarium();


        //добавить новое существо
        Shark shark = new Shark();
        //демонстрировать в аквариуме
        aquarium.demonstration(shark);


    }
}
